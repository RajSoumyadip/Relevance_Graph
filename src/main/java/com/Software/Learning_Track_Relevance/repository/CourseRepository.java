package com.Software.Learning_Track_Relevance.repository;

import com.Software.Learning_Track_Relevance.model.Course;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface CourseRepository extends Neo4jRepository<Course, Long> {

    @Query("")
    public Collection<Course> getAllCourses();
}
