package com.ula.filmstar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Film {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = true)
	private String description;

	public Film(String title, String description) {
		this.title = title;
		this.description = description;
	}

}
