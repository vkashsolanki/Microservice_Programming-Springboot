package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crud.entity.Student;
import com.crud.repository.StudentRepository;
import com.crud.service.StudentService;


@Controller
public class StudentController {
	
	
	private StudentService studentService;
	
	
	
	
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	// display list of employees
	@RequestMapping(value = "/", method = RequestMethod.GET) 
    public String viewHomePage(Model model) {
        model.addAttribute("liststudent", studentService.getAllStudent());
        return "index";
    }

    @GetMapping( value = "/showStudentForm")
    public String showNewStudnetForm(Model model) {
        // create model attribute to bind form data
        Student student = new Student();
        model.addAttribute("student", student);
        return "newstudent";
    }

    @PostMapping(value = "/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {
        // save employee to database
        studentService.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping(value = "/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // get employee from the service
        Student student = studentService.getStudentByIs(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("student", student);
        return "updatestudent";
    }

    @GetMapping(value = "/deleteStudent/{id}")
    public String deeleteStudent(@PathVariable(value = "id") long id) {

        // call delete employee method 
        this.studentService.deleteStudent(id);
        return "redirect:/";
    }

}