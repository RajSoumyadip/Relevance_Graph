package com.Software.Learning_Track_Relevance.resource;

import com.Software.Learning_Track_Relevance.model.Course;
import com.Software.Learning_Track_Relevance.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/rest/neo4j/course")
public class CourseResource {

    @Autowired
    CourseService courseService;

    @GetMapping
    public Collection<Course> getAll(){
        return courseService.getAll();
    }

}
