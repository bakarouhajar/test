package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Filiere;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@RestController
@RequestMapping("students")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/save")
	public void save(@RequestBody Student student){
	studentRepository.save(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) String id){
	Student s = studentRepository.findById(Integer.parseInt(id));
	studentRepository.delete(s);
	}
	
	@GetMapping("/all")
	public List<Student> findAll(){
	return studentRepository.findAll();
	}
	
	@GetMapping(value = "/count")
	public long countStudent() {
	return studentRepository.count();
	}
	
	@GetMapping(value = "/byYear")
	public Collection<?> findByYear() {
	return studentRepository.findNbrStudentByYear();
	}
	
	@GetMapping(value = "/byFiliere")
	public List<Student> findByFiliere(@RequestBody Filiere filiere) {
		return studentRepository.findByFiliere(filiere);
	}
	
	
	
	
}
