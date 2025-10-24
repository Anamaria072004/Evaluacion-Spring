package com.spring.service;

import java.util.List;
import java.util.Optional;

import com.spring.model.Cita;
import com.spring.model.Profesional;
import com.spring.model.Usuario;

public interface CitaService {
    Cita save(Cita cita);
    Optional<Cita> findById(Integer id);
    List<Cita> findAll();
    void deleteById(Integer id);
    List<Cita> findByUsuario(Usuario usuario);
    List<Cita> findByProfesional(Profesional profesional);
}
