package com.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
	
	
	

}
