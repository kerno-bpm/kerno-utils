package com.kerno.utils.cqrs;

@Deprecated
public interface KernoDeleteService<ID> {
    void deleteEntity(ID id);
}
