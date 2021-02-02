package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.Pret;

@Repository
public interface PretRepo extends JpaRepository<Pret, Long> {

}
