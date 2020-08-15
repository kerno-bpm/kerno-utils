package com.kerno.utils.cqrs;

public interface KernoFetchByIdService<T, ID> {
    T findByID(ID id);
}
