package com.mediatheque.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
@Inheritance(strategy = InheritanceType.JOINED)
public class SupportElectronique extends Support {	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String type;
	private long codeBarre;
	public SupportElectronique(String type, long codeBarre) {
		super();
		this.type = type;
		this.codeBarre = codeBarre;
	}
	
}
