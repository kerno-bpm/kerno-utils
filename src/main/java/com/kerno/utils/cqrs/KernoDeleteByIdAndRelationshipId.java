package com.kerno.utils.cqrs;

/**
 * ID identifier for the entity to delete
 * R identifier for the relationship belong to the entity to delete.
 *
 * @param <ID>
 * @param <R>
 */
public interface KernoDeleteByIdAndRelationshipId<ID, R> {
    void delete(ID id, R r);
}
