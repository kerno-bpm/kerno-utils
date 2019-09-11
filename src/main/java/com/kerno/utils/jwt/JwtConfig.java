package com.kerno.utils.jwt;

import lombok.Data;

@Data
public class JwtConfig {
    private String url;
    private String header;
    private String prefix;
    private long expiration;
    private String secret;
}
