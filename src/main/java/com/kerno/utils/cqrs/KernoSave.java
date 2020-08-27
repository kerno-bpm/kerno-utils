package com.kerno.utils.cqrs;

/**
 * Contains the CRUD operations.
 *
 * @param <E> (DTO or Entity JPA)
 * @param <T> (DTO or Entity JPA)
 */
public interface KernoSave<E, T> {

    /**
     * Allows save a entity E, receive a DTO T as parameter
     *
     * @param data
     * @return
     */
    E save(T data);

}
