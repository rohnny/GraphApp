package com.github.rohnny.graph.repo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@NodeEntity
public class RootEntity {
    @Id @GeneratedValue
    private Long id;
    @NonNull
    private String name;

    @Relationship(type = "SeasonEntity", direction = Relationship.UNDIRECTED)
    private List<SeasonEntity> children = new ArrayList<>();
}
