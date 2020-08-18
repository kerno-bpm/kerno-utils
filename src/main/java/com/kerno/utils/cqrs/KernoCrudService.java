package com.kerno.utils.cqrs;

/**
 * Contains the CRUD operations.
 *
 * @param <E>  (DTO or Entity JPA)
 * @param <ID> (Identifier)
 * @param <T>  (DTO or Entity JPA)
 */
public interface KernoCrudService<E, ID, T> {
    /**
     * Allows save
     *
     * @param data
     * @return
     */
    E save(T data);

    /**
     * Allows get a DTO preference by identifier
     *
     * @param id
     * @return
     */
    T findBy(ID id);

    /**
     * @param id
     * @return
     */
    <S> S delete(ID id);
}
