package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.Support;

@Repository
public interface SupportRepo extends JpaRepository<Support, Long>{

}
