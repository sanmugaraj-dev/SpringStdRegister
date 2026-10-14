package com.example.StudentRegistrationSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String emailId;
    private String rCourse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getrCourse() {
        return rCourse;
    }

    public void setrCourse(String rCourse) {
        this.rCourse = rCourse;
    }

    public CourseRegistry(String name, String emailId, String rCourse) {
        this.name = name;
        this.emailId = emailId;
        this.rCourse = rCourse;
    }

    public CourseRegistry() {
    }
}
