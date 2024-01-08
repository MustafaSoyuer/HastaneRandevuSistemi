package com.mustafa.repository;

import com.mustafa.entity.Brans;

public class BransRepository extends RepositoryManager<Brans,Long>{
    public BransRepository() {
        super(new Brans());
    }
}
