package com.spring.service;

import java.util.List;
import java.util.Optional;

import com.spring.model.Cita;
import com.spring.model.Profesional;
import com.spring.model.Usuario;

public interface ProfesionalService {
	Profesional save(Profesional profesional);
    Optional<Profesional> findById(Integer id);
    List<Profesional> findAll();
    void deleteById(Integer id);
}
