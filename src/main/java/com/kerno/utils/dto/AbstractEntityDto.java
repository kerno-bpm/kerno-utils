package com.kerno.utils.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class AbstractEntityDto extends AbstractIdDto {
    private boolean active;
    private Timestamp created;
    private Timestamp updated;

    public AbstractEntityDto() {
        active = true;
    }
}
