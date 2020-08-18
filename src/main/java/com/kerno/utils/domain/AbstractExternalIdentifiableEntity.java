package com.kerno.utils.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
@ToString(callSuper = true)
public class AbstractExternalIdentifiableEntity extends AbstractEntity {
    protected String externalId;

    @PrePersist
    public void initializeExternalId() {
        if (externalId == null) {
            externalId = UUID.randomUUID().toString();
        }
    }

}
