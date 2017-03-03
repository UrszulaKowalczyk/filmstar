package com.ula.filmstar.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ula.filmstar.model.Film;
import com.ula.filmstar.request.FilmRequest;


public class FilmMapperTest {
	
	private FilmMapper filmMapper = new FilmMapper();
	
	@Test
	public void shouldMapToFilm(){
		//given
		FilmRequest filmRequest = FilmRequest.builder()
				.title("title")
				.description("description")
				.build();
		
		//when
		Film film = filmMapper.map(filmRequest);
		
		//then
		assertNotNull(film);
		assertEquals(filmRequest.getTitle(), film.getTitle());
		assertEquals(filmRequest.getDescription(), film.getDescription());
	}
	

}
