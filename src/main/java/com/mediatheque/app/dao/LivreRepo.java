package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.Livre;

@Repository
public interface LivreRepo extends JpaRepository<Livre, Long>{

}
