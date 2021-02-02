package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.SupportPapier;

@Repository
public interface SupportPapierRepo extends JpaRepository<SupportPapier, Long>{

}
