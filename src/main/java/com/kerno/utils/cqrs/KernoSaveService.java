package com.kerno.utils.cqrs;

public interface KernoSaveService<E, ID, T> {
    E save(T data);

    E update(T data, ID id);
}
