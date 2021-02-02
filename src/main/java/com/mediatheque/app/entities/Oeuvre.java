package com.mediatheque.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Oeuvre {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String titre;
	private String auteur;
	private String editeur;
	private String anneeDeSortie;
	public Oeuvre(String titre, String auteur, String editeur, String anneeDeSortie) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.anneeDeSortie = anneeDeSortie;
	}
}
