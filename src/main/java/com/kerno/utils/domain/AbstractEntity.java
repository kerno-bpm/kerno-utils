package com.kerno.utils.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@MappedSuperclass
public abstract class AbstractEntity extends AbstractId {
    @Column(name = "is_active", nullable = false)
    private Boolean active;
    @Column(updatable = false)
    private Timestamp created;
    @Version
    @Column
    private Timestamp updated;

    @PrePersist
    public void createAt() {
        created = new Timestamp(System.currentTimeMillis());
        active = true;
    }
}
