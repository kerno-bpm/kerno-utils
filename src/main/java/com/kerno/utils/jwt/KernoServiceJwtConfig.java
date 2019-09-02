package com.kerno.utils.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapper;

import java.util.Date;

@Slf4j
public class KernoServiceJwtConfig {
    private final static String KERNO_USER_CLAIM = "KERNO_USER";

    public static UserJwt getUserDetails(String token, String key) {
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        Claims claims = Jwts.parser()
                .setSigningKey(key.getBytes())
                .parseClaimsJws(token)
                .getBody();

        UserJwt userJwt = new UserJwt();
        userJwt.setExpiration(claims.getExpiration());
        userJwt.setJti(claims.getId());
        userJwt.setSubject(claims.getSubject());
        userJwt.setCustomClaim(dozerBeanMapper.map(claims.get(KERNO_USER_CLAIM),CustomClaim.class));
        return userJwt;
    }

    public static String createJwtToken(UserJwt user, JwtConfig jwtConfig) {
        if (user.getSubject() == null) {
            log.error("the user not exists {}", user.getSubject());
            return null;
        }

        String data = Jwts
                .builder()
                .setId(user.getJti())
                .setSubject(user.getSubject())
                .claim(KERNO_USER_CLAIM, user.getCustomClaim())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(user.getExpiration())
                .signWith(SignatureAlgorithm.HS512,
                        jwtConfig.getSecret().getBytes()).compact();
        return data;
    }
}
