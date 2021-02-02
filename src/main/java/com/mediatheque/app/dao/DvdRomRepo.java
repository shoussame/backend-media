package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.Dvd_Rom;

@Repository
public interface DvdRomRepo extends JpaRepository<Dvd_Rom, Long>{

}
