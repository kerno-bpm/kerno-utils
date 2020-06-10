package com.kerno.utils.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class AbstractEntityDTO extends AbstractIdDTO {
    private boolean active;
    private Timestamp created;
    private Timestamp updated;

    public AbstractEntityDTO() {
        active = true;
    }
}
