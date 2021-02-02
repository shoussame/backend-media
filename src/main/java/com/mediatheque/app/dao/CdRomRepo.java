package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.Cd_Rom;

@Repository
public interface CdRomRepo extends JpaRepository<Cd_Rom, Long>{

}
