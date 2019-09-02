package com.kerno.utils.jwt;

import lombok.Data;

import java.util.Collection;

@Data
public class CustomClaim {
    private String accountId;
    private boolean isSuperUser;
    Collection<String> authorities;
}
