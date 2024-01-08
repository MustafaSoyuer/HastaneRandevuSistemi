package com.mustafa.repository;

import com.mustafa.entity.Hasta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.List;

public class HastaRepository extends RepositoryManager<Hasta,Long>{
    public HastaRepository() {
        super(new Hasta());
    }

}
