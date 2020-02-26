package com.github.rohnny.graph.repo.entity;

import org.neo4j.ogm.annotation.*;

@NodeEntity
public class RootEntity {
    @Id @GeneratedValue
    private Long id;
    private String name;

    public RootEntity() {
    }

    public RootEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
