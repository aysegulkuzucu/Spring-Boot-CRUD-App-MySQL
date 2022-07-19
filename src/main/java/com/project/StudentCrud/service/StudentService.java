package com.project.StudentCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudentCrud.entity.Student;
import com.project.StudentCrud.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
    private StudentRepository studentRepository;
public List<Student> listAll() {
        return studentRepository.findAll();
    }
    
    public void save(Student std) {
    	studentRepository.save(std);
    }
    
    public Student get(long id) {
        return studentRepository.findById(id).get();
    }
    
    public void delete(long id) {
    	studentRepository.deleteById(id);
    }
 
}