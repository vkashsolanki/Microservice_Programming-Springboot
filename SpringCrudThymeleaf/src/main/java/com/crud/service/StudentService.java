package com.crud.service;

import com.crud.entity.Student;

public interface StudentService {
	
	
	public void saveStudent(Student student);
	public java.util.List<Student> getAllStudent();
	public Student getStudentByIs(long id);
	public void deleteStudent(long id);
	
}
