package com.rohit.springrestdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.springrestdemo.classes.Student;
import com.rohit.springrestdemo.service.ClassService;

@RestController
@RequestMapping("/rohit")
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		return "This is home controller";
	}
	
	@Autowired
	private ClassService classService;
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return classService.getAllStudents();
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable Integer studentId)
	{
		return classService.getStudent(studentId);
	}
	
	@PostMapping(path="/student", consumes="application/json")
	public Student addStudent(@RequestBody Student student)
	{
		return classService.addStudent(student);
	}
	
	@PutMapping("/student/{studentId}")
	public Student updateSatudent(@PathVariable Integer studentId,@RequestBody Student student)
	{
		return classService.updateStudent(studentId,student);
	}
}
