package com.ula.filmstar.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ula.filmstar.dto.FilmDTO;

@Transactional
@Repository
public class FilmDTORepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public List<FilmDTO> findIdAndTitle() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		final String qlString = "SELECT f.id AS id, f.title AS title FROM Film f";
		Query query = entityManager.createQuery(qlString);
		List<Object[]> listOfIdAndTitle =  query.getResultList();
		List<FilmDTO> result = new ArrayList<>();

		for (Object[] objectArray : listOfIdAndTitle) {
			Long id = (Long) objectArray[0];
			String title = (String) objectArray[1];
			result.add(new FilmDTO(id, title));
		}
		
		return result;
	}

}
