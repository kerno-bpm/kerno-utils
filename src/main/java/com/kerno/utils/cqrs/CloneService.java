package com.kerno.utils.cqrs;

/**
 * Allows clone a object by ID and returns a DTO or Entity (T)
 *
 * @param <T>
 * @param <ID>
 */
public interface CloneService<T, ID> {
    T clone(ID id);
}
