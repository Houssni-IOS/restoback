package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Speciality {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column
	private String nom;
	@ManyToMany(mappedBy = "specialities")
    private Set<Restaurant> restaurants=new HashSet<>();

}
