package com.kerno.utils.jwt;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;


@Data
public class JwtConfig {
    @Value("${kerno.jwt.uri:/kerno-base/auth/**}")
    private String url;
    @Value("${kerno.jwt.header:Authorization}")
    private String header;
    @Value("${kerno.jwt.prefix:Bearer }")
    private String prefix;
    @Value("${kerno.jwt.expiration:86400000}")
    private long expiration;
    @Value("${kerno.jwt.secret:kerno-secret}")
    private String secret;

}
