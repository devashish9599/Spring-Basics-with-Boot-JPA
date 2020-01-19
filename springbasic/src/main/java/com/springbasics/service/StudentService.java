package com.springbasics.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbasics.model.StudentEntity;
import com.springbasics.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<StudentEntity> getAllStudents(){
		
		List<StudentEntity> result = (List<StudentEntity>) studentRepository.findAll();
		return result;
	}
	
	
	public StudentEntity getStudentById(Long id){
		
		Optional<StudentEntity> specificResult = studentRepository.findById(id);
		if(specificResult.isPresent()) {
			return specificResult.get();
		} else {
			
		}
		return null;
		
	}
	

}
