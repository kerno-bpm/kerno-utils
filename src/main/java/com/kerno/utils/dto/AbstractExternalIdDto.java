package com.kerno.utils.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class AbstractExternalIdDto extends AbstractDto {
    private UUID externalId;
}
