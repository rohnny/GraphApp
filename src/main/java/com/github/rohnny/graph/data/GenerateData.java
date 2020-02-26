package com.github.rohnny.graph.data;

import com.github.rohnny.graph.repo.SeasonRepository;
import com.github.rohnny.graph.repo.entity.RootEntity;
import com.github.rohnny.graph.repo.RootRepository;
import com.github.rohnny.graph.repo.entity.SeasonEntity;
import com.github.rohnny.graph.util.DatabaseHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class GenerateData implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(GenerateData.class);

    private RootRepository rootRepository;
    private SeasonRepository seasonRepository;
    private DatabaseHelper databaseHelper;

    public GenerateData(RootRepository rootRepository, SeasonRepository seasonRepository, DatabaseHelper databaseHelper) {
        this.rootRepository = rootRepository;
        this.seasonRepository = seasonRepository;
        this.databaseHelper = databaseHelper;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Cleaning database...");
        databaseHelper.deleteAll();
        log.info("Generating data....");
        RootEntity root = new RootEntity("RootNode");

        SeasonEntity winter = new SeasonEntity("Winter");
        SeasonEntity summer = new SeasonEntity("Summer");
        SeasonEntity autumn = new SeasonEntity("Autumn");
        SeasonEntity spring = new SeasonEntity("Spring");

        root.getChildren().addAll(Arrays.asList(winter, summer, autumn, spring));
        rootRepository.save(root);
    }
}
