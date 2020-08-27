package com.kerno.utils.cqrs;

/**
 * Allows save, find and delete a entity
 *
 * @param <E>
 * @param <ID>
 * @param <T>
 * @autor: jmallas
 */
public interface KernoCrud<E, ID, T> extends KernoSave<E, T>, KernoFindById<ID>, KernoDeleteById<ID> {
}
