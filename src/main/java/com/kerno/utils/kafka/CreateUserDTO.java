package com.kerno.utils.kafka;

import lombok.Data;

@Data
public class CreateUserDTO {
    private String externalId;
    private String fistName;
    private String lastName;
    private String email;
    private String username;
    private String role;
    private String accountId;
}
