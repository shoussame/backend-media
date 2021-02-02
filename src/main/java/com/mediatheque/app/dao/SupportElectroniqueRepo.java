package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.SupportElectronique;

@Repository
public interface SupportElectroniqueRepo extends JpaRepository<SupportElectronique, Long> {

}
