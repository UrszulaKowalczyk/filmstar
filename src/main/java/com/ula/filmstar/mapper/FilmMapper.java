package com.ula.filmstar.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.ula.filmstar.dto.FilmDTO;
import com.ula.filmstar.model.Film;
import com.ula.filmstar.request.FilmRequest;

import lombok.NonNull;

@Component
public class FilmMapper {

	public Film map(@NonNull FilmRequest filmRequest) {
		Film film = Film.builder().title(filmRequest.getTitle()).description(filmRequest.getDescription()).build();
		return film;
	}

	public List<FilmDTO> map(@NonNull List<Object[]> listOfIdAndTitle) {
		return listOfIdAndTitle.stream()
				.map(FilmMapper::map)
				.collect(Collectors.toList());
	}

	private static FilmDTO map(Object[] obj) {
		Long id = (Long) obj[0];
		String title = (String) obj[1];
		return new FilmDTO(id, title);
	}

}
