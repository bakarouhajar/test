package com.example.demo.entity;

import java.util.List;

import javax.persistence.*;


@Entity
public class Filiere {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	@OneToMany(mappedBy = "filiere")
	private List<Student> l;
	public Filiere() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Student> getL() {
		return l;
	}
	public void setL(List<Student> l) {
		this.l = l;
	}

}
