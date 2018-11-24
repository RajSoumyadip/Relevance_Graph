package com.Software.Learning_Track_Relevance.model;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity

public class Course {
    @GraphId
    private Long  ID;
    private String Course_Name;


    public Course() {
    }

    public Long getID() {
        return ID;
    }

    public String getCourse_Name() {
        return Course_Name;
    }
}
