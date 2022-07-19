package com.project.StudentCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.StudentCrud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 
}