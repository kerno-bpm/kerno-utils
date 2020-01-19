package com.kerno.utils.cqrs;

public interface KernoDeleteService<ID> {

    void deleteEntity(ID id);
}
