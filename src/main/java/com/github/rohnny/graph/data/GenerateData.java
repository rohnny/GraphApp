package com.github.rohnny.graph.data;

import com.github.rohnny.graph.repo.entity.RootEntity;
import com.github.rohnny.graph.repo.entity.RootRepository;
import com.github.rohnny.graph.util.DatabaseHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GenerateData implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(GenerateData.class);

    private RootRepository rootRepository;
    private DatabaseHelper databaseHelper;

    public GenerateData(RootRepository rootRepository, DatabaseHelper databaseHelper) {
        this.rootRepository = rootRepository;
        this.databaseHelper = databaseHelper;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Cleaning database...");
        databaseHelper.deleteAll();
        log.info("Generating data....");
        RootEntity root = new RootEntity("RootNode");
        rootRepository.save(root);
    }
}
