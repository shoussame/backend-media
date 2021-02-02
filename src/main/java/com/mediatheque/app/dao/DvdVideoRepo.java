package com.mediatheque.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.app.entities.Dvd_Video;

@Repository
public interface DvdVideoRepo extends JpaRepository<Dvd_Video, Long> {

}
