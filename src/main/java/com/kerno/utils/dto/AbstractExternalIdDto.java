package com.kerno.utils.dto;

import lombok.Data;

@Data
public class AbstractExternalIdDto extends AbstractIdDto {
    private String externalId;
}
