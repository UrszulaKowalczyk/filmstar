package com.ula.filmstar.mapper;

import org.springframework.stereotype.Component;

import com.ula.filmstar.model.Film;
import com.ula.filmstar.request.FilmRequest;

import lombok.NonNull;

@Component
public class FilmMapper {

	public Film map(@NonNull FilmRequest filmRequest) {
		Film film = Film.builder()
				.title(filmRequest.getTitle())
				.description(filmRequest.getDescription())
				.build();
		return film;
	}

}
