package com.example.springstudent.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springstudent.model.Student;

public interface StudentRepository extends MongoRepository<Student, String>{
}
