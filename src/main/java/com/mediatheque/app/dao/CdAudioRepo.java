package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.Cd_Audio;

@Repository
public interface CdAudioRepo extends JpaRepository<Cd_Audio, Long>{

}
