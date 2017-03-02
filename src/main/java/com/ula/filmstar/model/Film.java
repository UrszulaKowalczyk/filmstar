package com.ula.filmstar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "film")
@Getter
@Setter
public class Film {

	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = true)
	private String description;

	public Film(String title, String description) {
		this.title = title;
		this.description = description;
	}

}
