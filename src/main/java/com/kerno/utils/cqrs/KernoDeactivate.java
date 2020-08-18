package com.kerno.utils.cqrs;

@Deprecated
public interface KernoDeactivate<T, ID> {
    T deactivate(ID data);
}
