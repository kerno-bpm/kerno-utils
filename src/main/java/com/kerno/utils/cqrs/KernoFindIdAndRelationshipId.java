package com.kerno.utils.cqrs;

/**
 * /**
 * * ID identifier for the entity to delete
 * * R identifier for the relationship belong to the entity to delete.
 *
 * @autor: jmallas
 */
public interface KernoFindIdAndRelationshipId<ID, R> {
    <S> S findByIdAndRelationshipId(ID id, R r);
}
