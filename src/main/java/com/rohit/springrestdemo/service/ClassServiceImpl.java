package com.rohit.springrestdemo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rohit.springrestdemo.classes.Student;

@Service
public class ClassServiceImpl implements ClassService {
	List<Student> sList;
	
	public ClassServiceImpl() {
		sList = new ArrayList<Student>();
		
		sList.add(new Student(1,"Rohit","B"));
		sList.add(new Student(2, "Sahil", "C"));
		sList.add(new Student(3, "Prajwal", "A") );
	}
	
	
	

	@Override
	public List<Student> getAllStudents() {
		return sList;
		
	}




	@Override
	public Student getStudent(Integer studentId) {
		Student s = null;
		for(Student student:sList) {
			if(student.getId() == studentId) {
				s = student;
				break;
			}
		}
		return s;
	}




	@Override
	public Student addStudent(Student student) {
		sList.add(student);
		return student;
	}




	@Override
	public Student updateStudent(Integer studentId, Student student) {
		Student s = null;
		for(Student st : sList) {
			if(st.getId() == studentId) {
				st.setName(student.getName());
				st.setSection(student.getSection());
				s = st;
			}
		}
		return s;
	}

}
