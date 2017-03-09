package com.ula.filmstar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ula.filmstar.dto.FilmDTO;
import com.ula.filmstar.mapper.FilmMapper;
import com.ula.filmstar.model.Film;
import com.ula.filmstar.repository.FilmJPARepository;
import com.ula.filmstar.repository.FilmRepository;
import com.ula.filmstar.request.FilmRequest;

@Service
public class FilmService {

	@Autowired
	private FilmJPARepository filmJPARepository;
	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private FilmMapper filmMapper;

	public List<FilmDTO> listIdAndTitle() {
		return filmRepository.findIdAndTitle();
	}

	public Film read(Long id) {
		Film film = filmJPARepository.findById(id);
		return film;
	}

	public void create(String title, String description) {
		FilmRequest filmRequest = new FilmRequest(title, description);
		Film film = filmMapper.map(filmRequest);
		filmJPARepository.save(film);
	}

	public void delete(Long id) {
		filmJPARepository.delete(id);
	}

	public void update(Long id, String title, String description) {
		Film film = filmJPARepository.findById(id);
		film.setTitle(title);
		film.setDescription(description);
		filmJPARepository.save(film);
	}

}
