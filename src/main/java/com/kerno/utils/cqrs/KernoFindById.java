package com.kerno.utils.cqrs;

/**
 * @autor: jmallas
 */
public interface KernoFindById<ID> {
    /**
     * Allows get a DTO preference by identifier
     *
     * @param id
     * @return
     */
    <S> S findByIdentifiable(ID id);

}
