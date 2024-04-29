package com.YOUMNA.studentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.YOUMNA.studentsystem.entities.Student;
import com.YOUMNA.studentsystem.service.StudentService;

//restcontroller so that it will just get the response body and controller at the same time


@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/add")
	public String add(@RequestBody Student sudent) {
		studentService.saveStudent(sudent);
		return "New Student is added";
	}

}
