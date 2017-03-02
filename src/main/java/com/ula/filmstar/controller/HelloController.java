package com.ula.filmstar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ula.filmstar.model.Film;
import com.ula.filmstar.repository.FilmRepository;

@Controller
public class HelloController {

	@Autowired
	private FilmRepository filmRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		Film film = new Film("tytul", "opis");
		filmRepository.save(film);
		model.addAttribute("message", "Hello Spring MVC Framework!");

		return "index";

	}

}
