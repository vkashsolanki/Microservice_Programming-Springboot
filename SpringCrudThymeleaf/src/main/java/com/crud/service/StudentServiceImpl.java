package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Student;
import com.crud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentRepository studentRepository;
	
	
	
	
	
	
	


	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudent() {
		
		return (List<Student>) studentRepository.findAll();
		
	}
	
	@Override
	public void saveStudent(Student student) {

		studentRepository.save(student);

	}

	@Override
	public Student getStudentByIs(long id) {
		Optional<Student> optional = studentRepository.findById(id);
		Student student = null;
		if(optional.isPresent()) {
			student = optional.get();
		}else
		{
			throw new RuntimeException("Student not found id :: "+id);
			
		}
		return student;
	}

	@Override
	public void deleteStudent(long id) {
		this.studentRepository.deleteById(id);
		
	}
	
}
