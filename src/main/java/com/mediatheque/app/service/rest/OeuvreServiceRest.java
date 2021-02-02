package com.mediatheque.app.service.rest;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mediatheque.app.entities.Oeuvre;
import com.mediatheque.app.service.MediathequeApp;

@RestController
@CrossOrigin("http://localhost:8080")
public class OeuvreServiceRest {
	private MediathequeApp mediaApp;

	public OeuvreServiceRest(MediathequeApp mediaApp) {
		super();
		this.mediaApp = mediaApp;
	}
	
	@PostMapping("/ajouterOeuvre")
	public Oeuvre ajouterOeuvre(@RequestBody Oeuvre oeuvre) {
		return mediaApp.ajouterOeuvre(oeuvre);
	}
	
	@GetMapping("/oeuvres")
	public Collection<Oeuvre> getOeuvres(){
		return mediaApp.listerOeuvres();
	}
	
	@PostMapping("/modifierOeuvre")
	public Oeuvre modifierOeuvre(@RequestBody Oeuvre oeuvre){
		return mediaApp.modifierOeuvre(oeuvre);
	}
	
	@PostMapping("/deleteOeuvre")
	public void deleteOeuvre(@RequestBody long id){
		mediaApp.supprimerOeuvre(id);;
	}
}
