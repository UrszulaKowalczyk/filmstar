package com.ula.filmstar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ula.filmstar.model.Film;
import com.ula.filmstar.repository.FilmRepository;
import com.ula.filmstar.service.FilmService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HelloController {

	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private FilmService filmService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		log.info("Logi dzialaja");
		Film film = new Film("tytul", "opis");
		filmRepository.save(film);
		model.addAttribute("message", filmService.listIdAndTitle().get(0).getTitle());

		return "index";

	}

}
