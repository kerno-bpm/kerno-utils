package com.kerno.utils.cqrs;

public interface KernoSaveUpdateService<E, ID, T> {
    E save(T data);

    E update(T data, ID id);
}
