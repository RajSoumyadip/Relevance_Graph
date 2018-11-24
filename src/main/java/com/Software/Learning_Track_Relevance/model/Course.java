package main.java.com.Software.learning_track_relevance.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class course {

    @GraphId
    private Long id;
    private String name;

    public course() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
