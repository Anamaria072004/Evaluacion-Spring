package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Cita;
import com.spring.model.Profesional;
import com.spring.model.Usuario;


public interface CitaRepository extends JpaRepository<Cita, Integer> {

	List<Cita> findByUsuario(Usuario usuario);
	List<Cita> findByProfesional(Profesional profesional);
}
