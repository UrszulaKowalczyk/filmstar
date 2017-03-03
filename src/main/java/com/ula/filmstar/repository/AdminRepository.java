package com.ula.filmstar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ula.filmstar.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	Admin findById(Long id);

}
