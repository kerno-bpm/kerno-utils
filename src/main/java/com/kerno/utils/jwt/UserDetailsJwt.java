package com.kerno.utils.jwt;

import lombok.Data;

import java.util.Collection;
import java.util.Date;

@Data
public class UserDetailsJwt {
    private String externalId;
    private String username;
    private Date expiration;
    private String accountId;
    Collection<String> authorities;
}
