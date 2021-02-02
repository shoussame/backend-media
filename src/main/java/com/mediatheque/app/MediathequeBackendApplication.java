package com.mediatheque.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mediatheque.app.entities.Oeuvre;
import com.mediatheque.app.service.MediathequeApp;

@SpringBootApplication
public class MediathequeBackendApplication {
	@Autowired
	private MediathequeApp mediaApp;
	public static void main(String[] args) {
		SpringApplication.run(MediathequeBackendApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start() {
		return args -> {
			mediaApp.ajouterOeuvre(new Oeuvre("Abc", "Houssame", "Souhane", "2020"));
			mediaApp.ajouterOeuvre(new Oeuvre("Ej", "Hiba", "Souhane", "2015"));
			mediaApp.ajouterOeuvre(new Oeuvre("HT", "Houssame", "Souhane", "2013"));
		};
	}
	
}
