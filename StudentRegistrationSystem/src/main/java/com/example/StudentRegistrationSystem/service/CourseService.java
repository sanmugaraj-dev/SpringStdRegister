package com.example.StudentRegistrationSystem.service;

import com.example.StudentRegistrationSystem.entity.Course;
import com.example.StudentRegistrationSystem.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;
    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }
}
