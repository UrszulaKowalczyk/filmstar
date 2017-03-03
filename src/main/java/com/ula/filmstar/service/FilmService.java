package com.ula.filmstar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ula.filmstar.mapper.FilmMapper;
import com.ula.filmstar.model.Film;
import com.ula.filmstar.repository.FilmRepository;
import com.ula.filmstar.request.FilmRequest;

@Service
public class FilmService {

	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private FilmMapper filmMapper;

	public List<Film> list() {
		List<Film> listOfFilms = filmRepository.findAll();
		return listOfFilms;
	}

	public Film read(Long id) {
		Film film = filmRepository.findById(id);
		return film;
	}

	public void create(String title, String description) {
		FilmRequest filmRequest = new FilmRequest(title, description);
		Film film = filmMapper.map(filmRequest);
		filmRepository.save(film);
	}

	public void delete(Long id) {
		filmRepository.delete(id);
	}

	public void update(Long id, String title, String description) {
		Film film = filmRepository.findById(id);
		film.setTitle(title);
		film.setDescription(description);
		filmRepository.save(film);
	}

}
