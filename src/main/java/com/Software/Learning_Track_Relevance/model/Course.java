package main.java.com.Software.learning_track_relevance.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Course {

    @GraphId
    private Long id;
    private String name;

    public Course() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
