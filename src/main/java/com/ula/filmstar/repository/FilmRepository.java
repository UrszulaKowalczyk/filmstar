package com.ula.filmstar.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ula.filmstar.dto.FilmDTO;
import com.ula.filmstar.mapper.FilmMapper;

@Transactional
@Repository
public class FilmRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	@Autowired
	private FilmMapper filmMapper;

	public List<FilmDTO> findIdAndTitle() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		final String qlString = "SELECT f.id AS id, f.title AS title FROM Film f";
		Query query = entityManager.createQuery(qlString);
		List<Object[]> listOfIdAndTitle = query.getResultList();
		return filmMapper.map(listOfIdAndTitle);
	}

}
