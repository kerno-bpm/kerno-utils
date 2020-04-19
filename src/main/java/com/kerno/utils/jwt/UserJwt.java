package com.kerno.utils.jwt;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class UserJwt {
    private String jti;
    private String subject;
    private Date expiration;
    private CustomClaim customClaim;
    private List<Authority> authorities = new ArrayList<>();
}
