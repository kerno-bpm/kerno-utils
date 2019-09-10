package com.kerno.utils.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class CredentialsDto {
    private String subject;
    private String accountId;
    private boolean isSuperUser;

    public CredentialsDto(String subject, String accountId, boolean isSuperUser) {
        this.accountId = accountId;
        this.isSuperUser = isSuperUser;
        this.subject = subject;
    }
}
