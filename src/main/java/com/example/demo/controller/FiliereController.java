package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Filiere;
import com.example.demo.repository.FiliereRepository;

@RestController
@RequestMapping("filieres")
public class FiliereController {
	@Autowired
	private FiliereRepository filiereRepository;

	@PostMapping("/save")
	public void save(@RequestBody Filiere filiere) {
		filiereRepository.save(filiere);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Filiere s = filiereRepository.findById(Integer.parseInt(id));
		filiereRepository.delete(s);
	}

	@GetMapping("/all")
	public List<Filiere> findAll() {
		return filiereRepository.findAll();
	} 

	@GetMapping(value = "/count")
	public long countFiliere() {
		return filiereRepository.count();
	}

	@GetMapping(value = "/byYear")
	public Collection<?> findByYear() {
		return filiereRepository.findNbrFiliere();
	}

}
