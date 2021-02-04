package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.Pret;

@RepositoryRestController
public interface PretRepo extends JpaRepository<Pret, Long> {

}
