package com.ula.filmstar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "admin")
@Getter
@Setter
public class Admin {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String login;

	@Column(nullable = false)
	private String password;

}
