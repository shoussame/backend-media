package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.Coffret;

@Repository
public interface CoffretRepo extends JpaRepository<Coffret, Long>{

}
