package com.mediatheque.app.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Coffret {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String titre;
	@ManyToMany(fetch = FetchType.LAZY)
	private Collection<Support> supports;
}
