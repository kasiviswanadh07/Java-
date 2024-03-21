package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
@RequestMapping("/crud")
public class CRUDcontroller {

	@GetMapping("{studentid}")
	public Student getStudentInfo(@PathVariable String studentid) {
		Student s1=new Student(studentid,"Kasi viswanadh",23);
		return s1;
	}
}
