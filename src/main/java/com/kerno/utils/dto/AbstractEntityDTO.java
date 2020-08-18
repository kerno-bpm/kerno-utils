package com.kerno.utils.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AbstractEntityDTO extends AbstractIdDTO {
    private boolean active;
    private LocalDateTime created;
    private LocalDateTime updated;

    public AbstractEntityDTO() {
        active = true;
    }
}
