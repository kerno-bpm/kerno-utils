package com.kerno.utils.cqrs;
@Deprecated
public interface KernoFetchByIdService<T, ID> {
    T findByID(ID id);
}
