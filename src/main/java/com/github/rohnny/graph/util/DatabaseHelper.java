package com.github.rohnny.graph.util;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class DatabaseHelper {
    private SessionFactory sessionFactory;

    public DatabaseHelper(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void deleteAll() {
        Session session = sessionFactory.openSession();
        session.query("MATCH (n) DETACH DELETE n;", Collections.emptyMap());
        session.clear();
    }
}
