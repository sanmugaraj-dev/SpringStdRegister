package com.example.StudentRegistrationSystem.repository;

import com.example.StudentRegistrationSystem.entity.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
