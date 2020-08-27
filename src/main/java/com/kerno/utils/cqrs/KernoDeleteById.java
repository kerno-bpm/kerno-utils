package com.kerno.utils.cqrs;

/**
 * @autor: jmallas
 */
public interface KernoDeleteById<ID> {
    /**
     * @param id
     * @return
     */
    void delete(ID id);
}
