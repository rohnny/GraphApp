package com.github.rohnny.graph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories(basePackages = "com.github.rohnny.graph.repo")
public class GraphApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphApplication.class, args);
	}

}
