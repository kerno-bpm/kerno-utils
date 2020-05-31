package com.kerno.utils.jwt;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CustomClaim {
    private String accountId;
    private boolean isSuperUser;
    private List<String> authorities = new ArrayList<>();
}
