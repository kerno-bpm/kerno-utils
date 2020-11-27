package com.kerno.utils.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapper;

import java.util.Date;

@Slf4j
public class KernoServiceJwtConfig {
    private KernoServiceJwtConfig() {

    }

    public static UserJwt getUserDetails(String token, String key) {

        Claims claims = Jwts.parser()
                .setSigningKey(key.getBytes())
                .parseClaimsJws(token)
                .getBody();
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        CustomClaim customClaim = dozerBeanMapper.map(claims.get("KERNO_CUSTOM_CLAIM"), CustomClaim.class);
        UserJwt userJwt = new UserJwt();
        userJwt.setExpiration(claims.getExpiration());
        userJwt.setJti(claims.getId());
        userJwt.setSubject(claims.getSubject());
        userJwt.setCustomClaim(customClaim);

        return userJwt;
    }

    public static String createJwtToken(UserJwt user, JwtConfig jwtConfig) {
        if (user.getSubject() == null) {
            log.error("the user not exists {}", user.getSubject());
            return null;
        }

        return Jwts
                .builder()
                .setId(user.getJti())
                .setSubject(user.getSubject())
                .claim("KERNO_CUSTOM_CLAIM", user.getCustomClaim())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(user.getExpiration())
                .signWith(SignatureAlgorithm.HS512,
                        jwtConfig.getSecret().getBytes()).compact();
    }
}
