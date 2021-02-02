package com.mediatheque.app.service;

import java.util.Collection;

import com.mediatheque.app.entities.Cd_Audio;
import com.mediatheque.app.entities.Cd_Rom;
import com.mediatheque.app.entities.Dvd_Rom;
import com.mediatheque.app.entities.Dvd_Video;
import com.mediatheque.app.entities.Livre;
import com.mediatheque.app.entities.Oeuvre;
import com.mediatheque.app.entities.Pret;
import com.mediatheque.app.entities.Revue;

public interface IMediathequeApp {
	public Oeuvre ajouterOeuvre(Oeuvre oeuvre);
	public Oeuvre modifierOeuvre(Oeuvre oeuvre);
	public void supprimerOeuvre(long id);
	public Collection<Oeuvre> listerOeuvres();
	public Collection<Cd_Audio> listerCdAudio();
	public Collection<Cd_Rom> listerCdRom();
	public Collection<Dvd_Rom> listerDvdRom();
	public Collection<Dvd_Video> listerDvdVideo();
	public Collection<Livre> listerLivres();
	public Collection<Pret> listerPret();
	public Collection<Revue> listerRevues();
}
