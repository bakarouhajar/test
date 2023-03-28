package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Filiere;

public interface FiliereRepository extends JpaRepository<Filiere, Integer> {
	Filiere findById(int id);
	@Query("select nom , count(*) as nbr from Filiere f ")
	Collection<?> findNbrFiliere();


}
