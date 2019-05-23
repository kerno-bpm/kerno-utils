package com.kerno.utils.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@RequiredArgsConstructor
@Slf4j
public class KernoServiceJwtConfig {
    private JwtConfig jwtConfig;
    private String bearerAuth;


    public UserDetailsJwt getUserDetails(String token, String key) {
        Claims claims = Jwts.parser()
                .setSigningKey(key.getBytes())
                .parseClaimsJws(token)
                .getBody();
        UserDetailsJwt userDetails = new UserDetailsJwt();
        userDetails.setUsername(claims.getSubject());
        userDetails.setAuthorities((List<String>) claims.get("authorities"));
        return userDetails;
    }

    public String createJwtToken(UserDetailsJwt user) {
        if (user.getUsername() == null) {
            log.error("the user not exists {}", user.getUsername());
            return null;
        }

        String data = Jwts
                .builder()
                .setId(user.getExternalId())
                .setSubject(user.getUsername())
                .claim("authorities",
                        user.authorities.stream()
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(user.getExpiration())
                .signWith(SignatureAlgorithm.HS512,
                        jwtConfig.getSecret().getBytes()).compact();
        return data;
    }
}
