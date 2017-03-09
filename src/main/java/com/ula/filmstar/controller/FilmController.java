package com.ula.filmstar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ula.filmstar.dto.FilmDTO;
import com.ula.filmstar.model.Film;
import com.ula.filmstar.service.FilmService;

@Controller
@RequestMapping("/films")
public class FilmController {

	@Autowired
	private FilmService filmService;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String listAllFilms(ModelMap model) {
		List<FilmDTO> listOfFilms = filmService.listIdAndTitle();
		model.addAttribute("message", listOfFilms);
		return "filmTitlesList";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public String showFilmDescription(@PathVariable("id") Long id, ModelMap model) {
		Film film = filmService.read(id);
		model.addAttribute("film", film);
		return "filmDescription";
	}

}
