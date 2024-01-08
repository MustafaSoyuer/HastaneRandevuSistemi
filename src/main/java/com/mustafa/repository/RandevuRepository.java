package com.mustafa.repository;

import com.mustafa.entity.Randevu;

public class RandevuRepository extends RepositoryManager<Randevu,Long>{
    public RandevuRepository() {
        super(new Randevu());
    }
}
