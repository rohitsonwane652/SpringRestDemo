package com.rohit.springrestdemo.service;

import java.util.List;


import com.rohit.springrestdemo.classes.Student;

public interface ClassService {
	public List<Student> getAllStudents();
	public Student getStudent(Integer studentId);
	public Student addStudent(Student student);
	public Student updateStudent(Integer studentId,Student student);
}
