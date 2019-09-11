package com.kerno.utils.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class CredentialsDto {
    private String subject;
    private String accountId;
    private String bearerToken;
    private boolean isSuperUser;

    public CredentialsDto(String subject, String accountId, boolean isSuperUser, String bearerToken) {
        this.accountId = accountId;
        this.isSuperUser = isSuperUser;
        this.subject = subject;
        this.bearerToken = bearerToken;
    }
}
