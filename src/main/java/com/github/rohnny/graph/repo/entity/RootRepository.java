package com.github.rohnny.graph.repo.entity;

import org.springframework.data.repository.CrudRepository;

public interface RootRepository extends CrudRepository<RootEntity, Long> {
    RootEntity getByName(String name);
}
