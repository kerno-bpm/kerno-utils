package com.kerno.utils.cqrs;

/**
 * Allows save, find and delete a entity with a relationship id
 *
 * @param <E>
 * @param <ID>
 * @param <T>
 * @param <R>
 * @autor: jmallas
 */
public interface KernoCrudWithRelationShip<E, ID, R, T> extends KernoSave<E, T>, KernoDeleteByIdAndRelationshipId<ID, R>,
        KernoFindIdAndRelationshipId<ID, R> {
}
