package com.kerno.utils.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Version;
import java.sql.Timestamp;

@Data
@MappedSuperclass
@ToString(callSuper = true)
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
