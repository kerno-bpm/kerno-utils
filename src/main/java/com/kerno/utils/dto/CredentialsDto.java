package com.kerno.utils.dto;

import lombok.Data;

@Data
public class CredentialsDto {
    private String accountId;
    private String token;
    private boolean isSuperUser;

    public CredentialsDto(String accountId, boolean isSuperUser, String token) {
        this.accountId = accountId;
        this.isSuperUser = isSuperUser;
        this.token = token;
    }

    public CredentialsDto() {
    }
}
