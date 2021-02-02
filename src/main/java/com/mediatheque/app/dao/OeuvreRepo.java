package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.Oeuvre;

@Repository
public interface OeuvreRepo extends JpaRepository<Oeuvre, Long>{

}
