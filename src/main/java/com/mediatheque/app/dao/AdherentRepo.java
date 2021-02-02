package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.Adherent;

@Repository
public interface AdherentRepo extends JpaRepository<Adherent, Long>{

}
