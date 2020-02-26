package com.github.rohnny.graph.repo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.neo4j.ogm.annotation.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@NodeEntity
public class SeasonEntity {
    @Id @GeneratedValue
    private Long id;
    @NonNull
    private String name;
}
