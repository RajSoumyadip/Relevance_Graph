package com.Software.Learning_Track_Relevance.service;

import com.Software.Learning_Track_Relevance.model.Course;
import com.Software.Learning_Track_Relevance.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CourseService {


    @Autowired
    CourseRepository courseRepository;
    public Collection<Course> getAll() {

       return courseRepository.getAllCourses();

    }
}
