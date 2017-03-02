package com.ula.filmstar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ula.filmstar.model.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {

	Film findById(int id);
}
