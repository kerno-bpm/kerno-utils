package com.kerno.utils.criteria;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KernoPageable {
    private int pageNumber;
    private int pageSize;
    private String filter;
    private String sort;
    private boolean orPredicateFlag;

    public KernoPageable() {
    }

    public KernoPageable(int pageNumber, int pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public KernoPageable(int pageNumber, int pageSize, String filter, boolean orPredicateFlag, String sort) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.filter = filter;
        this.orPredicateFlag = orPredicateFlag;
        this.sort = sort;
    }
}
