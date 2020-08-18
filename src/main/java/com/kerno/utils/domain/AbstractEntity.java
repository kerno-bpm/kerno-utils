package com.kerno.utils.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Version;
import java.time.LocalDateTime;

/**
 * This entity allows knowing the date when a change is made in a record
 */
@Getter
@Setter
@MappedSuperclass
@ToString(callSuper = true)
public class AbstractEntity extends AbstractId {
    @Column(name = "is_active", nullable = false)
    private Boolean active;
    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDateTime created;
    @Version
    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDateTime updated;

    @PrePersist
    public void createAt() {
        created = LocalDateTime.now();
        active = true;
    }

}
