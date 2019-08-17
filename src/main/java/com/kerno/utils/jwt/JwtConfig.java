package com.kerno.utils.jwt;

import lombok.Data;

@Data
public class JwtConfig {
    private String url;
    private String header;
    private String prefix;
    private int expiration;
    private String secret;
}
