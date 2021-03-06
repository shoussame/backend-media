package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.Revue;

@Repository
public interface RevueRepo extends JpaRepository<Revue, Long> {

}
