package com.mediatheque.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Adherent {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String prenom;
	private String email;
	private String cin;
	public Adherent(String nom, String prenom, String email,String cin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.cin= cin;
	}
	
}
