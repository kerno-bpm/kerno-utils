package com.kerno.utils.jwt;

import lombok.Data;

import java.util.Date;

@Data
public class UserJwt {
    private String jti;
    private String subject;
    private Date expiration;
    private CustomClaim customClaim;
}
