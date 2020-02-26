package com.github.rohnny.graph.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.rohnny.graph.repo.entity.RootEntity;
import com.github.rohnny.graph.repo.RootRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GraphController {
    private static final Logger log = LoggerFactory.getLogger(GraphController.class);

    private RootRepository rootRepository;

    public GraphController(RootRepository rootRepository) {
        this.rootRepository = rootRepository;
    }

    @GetMapping("/root")
    String graph() throws Exception {
        RootEntity root = rootRepository.getByName("RootNode");
        log.info("Retrieved root node: {}", root);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(root);
    }
}
