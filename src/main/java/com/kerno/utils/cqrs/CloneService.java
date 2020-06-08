package com.kerno.utils.cqrs;

public interface CloneService<T, ID> {
    T clone(ID id);
}
