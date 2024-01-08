package com.mustafa.repository;

import com.mustafa.entity.Doktor;

public class DoktorRepository extends RepositoryManager<Doktor,Long>{
    public DoktorRepository() {
        super(new Doktor());
    }
}
