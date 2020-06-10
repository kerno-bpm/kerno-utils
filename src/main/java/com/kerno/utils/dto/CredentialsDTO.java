package com.kerno.utils.dto;

import lombok.Data;

@Data
public class CredentialsDTO {
    private String accountId;
    private String token;
    private boolean isSuperUser;

    public CredentialsDTO(String accountId, boolean isSuperUser, String token) {
        this.accountId = accountId;
        this.isSuperUser = isSuperUser;
        this.token = token;
    }

    public CredentialsDTO() {
    }
}
