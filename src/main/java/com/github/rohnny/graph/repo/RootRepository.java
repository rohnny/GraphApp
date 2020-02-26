package com.github.rohnny.graph.repo;

import com.github.rohnny.graph.repo.entity.RootEntity;
import org.springframework.data.repository.CrudRepository;

public interface RootRepository extends CrudRepository<RootEntity, Long> {
    RootEntity getByName(String name);
}
