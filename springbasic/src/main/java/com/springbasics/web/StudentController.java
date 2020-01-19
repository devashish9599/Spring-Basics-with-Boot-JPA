package com.springbasics.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbasics.model.StudentEntity;
import com.springbasics.service.StudentService;

@Controller

public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/list")
	public String getAllStudents(Model model) {
		
		List<StudentEntity> list = studentService.getAllStudents();
		model.addAttribute("students", list);
		return "liststudents";
		
	}
		
	@RequestMapping(path = {"/particularlist","/particularlist/{id}"})	
	public String getParticular(Model model1, @PathVariable("id") Long id) {
		
		StudentEntity particularResult = studentService.getStudentById(id);
		model1.addAttribute("particularStudent", particularResult);
		return "particularstudent";
		
	}
		
		
	}
	
	

