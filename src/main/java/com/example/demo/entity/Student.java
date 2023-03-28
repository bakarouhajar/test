package com.example.demo.entity;

import java.util.Date;
import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String nom;
private String prenom;
@JsonIgnore
@ManyToOne
private Filiere filiere;

@Temporal(TemporalType.DATE)
private Date dateNaissance;
public Student() {
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
public String getPrenom() {
return prenom;
}
public void setPrenom(String prenom) {
this.prenom = prenom;
}
public Date getDateNaissance() {
return dateNaissance;
}
public void setDateNaissance(Date dateNaissance) {
this.dateNaissance = dateNaissance;
}
public Filiere getFiliere() {
	return filiere;
}
public void setFiliere(Filiere filiere) {
	this.filiere = filiere;
}

}
