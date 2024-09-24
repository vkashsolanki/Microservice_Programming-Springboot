package com.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String name;
private String email;
private long mobile;


public Student() {
	super();
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public long getMobile() {
	return mobile;
}


public void setMobile(long mobile) {
	this.mobile = mobile;
}


public Student(long id, String name, String email, long mobile) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.mobile = mobile;
}


 
	
	

}
