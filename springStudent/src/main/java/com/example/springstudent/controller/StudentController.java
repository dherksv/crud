package com.example.springstudent.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springstudent.model.Student;
import com.example.springstudent.repository.StudentRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping()


public class StudentController {

	StudentRepository studentRepository;
	
	@GetMapping("/student")
	public void getAllStudents(@RequestParam(required=false)String name)
	{		
	}

	  @GetMapping("/students/{id}")
	  public ResponseEntity<Student> getStudentById(@PathVariable("id") String id) {
		return null;
	    
	  }

	  @PostMapping("/students")
	  public void createStudent(@RequestBody Student Student) {
	    
	  }

	  @PutMapping("/students/{id}")
	  public  ResponseEntity<Student> updateStudent(@PathVariable("id") String id, @RequestBody Student Student) {
		return null;
	    
	  }

	  @DeleteMapping("/students/{id}")
	  public ResponseEntity<HttpStatus> deleteStudent(@PathVariable("id") String id) {
	    return null;
	  }

	  @DeleteMapping("/students")
	  public ResponseEntity<HttpStatus> deleteAllstudents() {
	    return null;
	  }

	  @GetMapping("/students/published")
	  public ResponseEntity<List<Student>> findByPublished() {
	    return null;
	  }
	
}
