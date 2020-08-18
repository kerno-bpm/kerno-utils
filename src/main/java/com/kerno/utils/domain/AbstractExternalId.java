package com.kerno.utils.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
@ToString(callSuper = true)
public class AbstractExternalId extends AbstractId {
    protected String externalId;

}
