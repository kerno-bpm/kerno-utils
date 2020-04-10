package com.kerno.utils.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.util.UUID;

@Data
@MappedSuperclass
@ToString(callSuper = true)
public abstract class AbstractEntityUUID extends AbstractEntity {
    protected UUID uuid;

    @PrePersist
    public void initializeExternalId() {
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
    }
}
