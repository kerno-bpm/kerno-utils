package com.kerno.utils.cqrs;

public interface KernoCrudService<E, ID, T> {
    E save(T data);

    T fetchById(ID id);
}
