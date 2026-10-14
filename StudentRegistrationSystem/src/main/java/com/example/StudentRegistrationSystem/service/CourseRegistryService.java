package com.example.StudentRegistrationSystem.service;

import com.example.StudentRegistrationSystem.entity.CourseRegistry;
import com.example.StudentRegistrationSystem.repository.CourseRegistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRegistryService {
    @Autowired
    CourseRegistryRepo crr;
    public List<CourseRegistry> enrolledStudents() {
        return crr.findAll();
    }
}
