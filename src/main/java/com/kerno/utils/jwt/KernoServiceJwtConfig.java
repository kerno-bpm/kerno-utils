package com.kerno.utils.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class KernoServiceJwtConfig {
    private final static String KERNO_USER_CLAIM = "KERNO_USER";

    public static UserDetailsJwt getUserDetails(String token, String key) {
        Claims claims = Jwts.parser()
                .setSigningKey(key.getBytes())
                .parseClaimsJws(token)
                .getBody();
        UserDetailsJwt userDetails = (UserDetailsJwt) claims.get(KERNO_USER_CLAIM);
        return userDetails;
    }

    public static String createJwtToken(UserDetailsJwt user, JwtConfig jwtConfig) {
        if (user.getUsername() == null) {
            log.error("the user not exists {}", user.getUsername());
            return null;
        }

        String data = Jwts
                .builder()
                .setId(user.getExternalId())
                .setSubject(user.getUsername())
                .claim(KERNO_USER_CLAIM, user)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(user.getExpiration())
                .signWith(SignatureAlgorithm.HS512,
                        jwtConfig.getSecret().getBytes()).compact();
        return data;
    }
}
