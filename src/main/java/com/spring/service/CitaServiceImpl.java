package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Cita;
import com.spring.model.Profesional;
import com.spring.model.Usuario;
import com.spring.repository.CitaRepository;

@Service
public class CitaServiceImpl implements CitaService {
    @Autowired
    private CitaRepository citaRepository;

    @Override
    public Cita save(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public Optional<Cita> findById(Integer id) {
        return citaRepository.findById(id);
    }

    @Override
    public List<Cita> findAll() {
        return citaRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        citaRepository.deleteById(id);
    }

    @Override
    public List<Cita> findByUsuario(Usuario usuario) {
        return citaRepository.findByUsuario(usuario);
    }

    @Override
    public List<Cita> findByProfesional(Profesional profesional) {
        return citaRepository.findByProfesional(profesional);
    }
}