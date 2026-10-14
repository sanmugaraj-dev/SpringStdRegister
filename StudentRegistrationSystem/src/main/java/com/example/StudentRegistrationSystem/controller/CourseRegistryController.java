package com.example.StudentRegistrationSystem.controller;

import com.example.StudentRegistrationSystem.entity.CourseRegistry;
import com.example.StudentRegistrationSystem.service.CourseRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseRegistryController {

    @Autowired
    CourseRegistryService crs;

    @GetMapping("enrolled")
    public List<CourseRegistry> enrolledStudents(){

        return crs.enrolledStudents();

    }
}
