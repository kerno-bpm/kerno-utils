package com.kerno.utils.dto;

import lombok.Data;

@Data
public class AbstractExternalIdDTO extends AbstractIdDTO {
    private String externalId;
}
