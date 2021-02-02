package com.mediatheque.app.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.mediatheque.app.dao.CdAudioRepo;
import com.mediatheque.app.dao.CdRomRepo;
import com.mediatheque.app.dao.DvdRomRepo;
import com.mediatheque.app.dao.DvdVideoRepo;
import com.mediatheque.app.dao.LivreRepo;
import com.mediatheque.app.dao.OeuvreRepo;
import com.mediatheque.app.dao.PretRepo;
import com.mediatheque.app.dao.RevueRepo;
import com.mediatheque.app.entities.Cd_Audio;
import com.mediatheque.app.entities.Cd_Rom;
import com.mediatheque.app.entities.Dvd_Rom;
import com.mediatheque.app.entities.Dvd_Video;
import com.mediatheque.app.entities.Livre;
import com.mediatheque.app.entities.Oeuvre;
import com.mediatheque.app.entities.Pret;
import com.mediatheque.app.entities.Revue;

@Transactional
@Service
public class MediathequeApp implements IMediathequeApp{
	private OeuvreRepo oeuvreRepo;
	private CdAudioRepo cdAudioRepo;
	private CdRomRepo cdRomRepo;
	private DvdRomRepo dvdRomRepo;
	private DvdVideoRepo dvdVideoRepo;
	private LivreRepo livreRepo;
	private PretRepo pretRepo;
	private RevueRepo revueRepo;
	
	public MediathequeApp(OeuvreRepo oeuvreRepo, CdAudioRepo cdAudioRepo, CdRomRepo cdRomRepo, DvdRomRepo dvdRomRepo,
			DvdVideoRepo dvdVideoRepo, LivreRepo livreRepo, PretRepo pretRepo, RevueRepo revueRepo) {
		super();
		this.oeuvreRepo = oeuvreRepo;
		this.cdAudioRepo = cdAudioRepo;
		this.cdRomRepo = cdRomRepo;
		this.dvdRomRepo = dvdRomRepo;
		this.dvdVideoRepo = dvdVideoRepo;
		this.livreRepo = livreRepo;
		this.pretRepo = pretRepo;
		this.revueRepo = revueRepo;
	}
	@Override
	public Oeuvre ajouterOeuvre(Oeuvre oeuvre) {
		return oeuvreRepo.save(oeuvre);
	}

	@Override
	public Oeuvre modifierOeuvre(Oeuvre oeuvre) {
		Oeuvre tempo = oeuvreRepo.getOne(oeuvre.getId());
		tempo.setId(oeuvre.getId());
		tempo.setAuteur(oeuvre.getAuteur());
		tempo.setAnneeDeSortie(oeuvre.getAnneeDeSortie());
		tempo.setEditeur(oeuvre.getEditeur());
		tempo.setTitre(oeuvre.getTitre());
		return oeuvreRepo.save(tempo);
	}

	@Override
	public Collection<Oeuvre> listerOeuvres() {
		return oeuvreRepo.findAll();
	}

	@Override
	public Collection<Cd_Audio> listerCdAudio() {
		return cdAudioRepo.findAll();
	}

	@Override
	public Collection<Cd_Rom> listerCdRom() {
		return cdRomRepo.findAll();
	}

	@Override
	public Collection<Dvd_Rom> listerDvdRom() {
		return dvdRomRepo.findAll();
	}

	@Override
	public Collection<Dvd_Video> listerDvdVideo() {
		return dvdVideoRepo.findAll();
	}

	@Override
	public Collection<Livre> listerLivres() {
		return livreRepo.findAll();
	}

	@Override
	public Collection<Pret> listerPret() {
		return pretRepo.findAll();
	}

	@Override
	public Collection<Revue> listerRevues() {
		return revueRepo.findAll();
	}

	@Override
	public void supprimerOeuvre(long id) {
		oeuvreRepo.deleteById(id);		
	}

}
