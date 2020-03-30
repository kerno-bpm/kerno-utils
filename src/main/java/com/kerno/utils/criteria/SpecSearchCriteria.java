package com.kerno.utils.criteria;

import lombok.Data;

@Data
public class SpecSearchCriteria {
    private String key;
    private SearchOperation operation;
    private Object value;
    private boolean orPredicate;

    public SpecSearchCriteria(final boolean orPredicate, final String key, final SearchOperation operation, final Object value) {
        super();
        this.orPredicate = orPredicate;
        this.key = key;
        this.operation = operation;
        this.value = value;
    }
}
