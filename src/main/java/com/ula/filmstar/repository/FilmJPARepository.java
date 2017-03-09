package com.ula.filmstar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ula.filmstar.model.Film;

public interface FilmJPARepository extends JpaRepository<Film, Long> {

	Film findById(Long id);

}
