package com.kerno.utils.cqrs;

public interface KernoDeactivate<T, ID> {
    T deactivate(ID data);
}
