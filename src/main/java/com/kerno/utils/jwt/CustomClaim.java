package com.kerno.utils.jwt;

import lombok.Data;

@Data
public class CustomClaim {
    private String accountId;
    private boolean isSuperUser;
}
