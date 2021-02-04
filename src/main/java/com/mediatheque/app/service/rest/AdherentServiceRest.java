package com.mediatheque.app.service.rest;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mediatheque.app.entities.Adherent;
import com.mediatheque.app.entities.Oeuvre;
import com.mediatheque.app.service.MediathequeApp;

@RestController
@CrossOrigin("http://localhost:8080")
public class AdherentServiceRest {
	private MediathequeApp mediaApp;
	
	
	public AdherentServiceRest(MediathequeApp mediaApp) {
		super();
		this.mediaApp = mediaApp;
	}

	@PostMapping("/ajouterAdherent")
	public Adherent ajouterOeuvre(@RequestBody Adherent adherent) {
		return mediaApp.ajouterAdherent(adherent);
	}
	
	@GetMapping("/adherents")
	public Collection<Adherent> getAdherents(){
		return mediaApp.listerAdherents();
	}
	
	@PostMapping("/modifierAdherent")
	public Oeuvre modifierOeuvre(@RequestBody Oeuvre oeuvre){
		return mediaApp.modifierOeuvre(oeuvre);
	}
	
	@DeleteMapping("/deleteAdherent/{id}")
	public void deleteOeuvre(@PathVariable long id){
		mediaApp.supprimerAdherent(id);
	}
}
