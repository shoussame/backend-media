package com.mediatheque.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Revue extends SupportPapier{
	private String issn;
	private long numero;

	public Revue(String issn) {
		super();
		super.setType("REVUE");
		this.issn = issn;
	}
	
}
