package com.mediatheque.app.entities;

import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

import lombok.Data;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Pret {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date dateEmprunt;
	@OneToOne(fetch = FetchType.LAZY)
	private Oeuvre oeuvre;
}
