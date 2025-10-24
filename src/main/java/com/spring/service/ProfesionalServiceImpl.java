package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Profesional;
import com.spring.model.Servicio;
import com.spring.repository.ProfesionalRepository;
import com.spring.repository.ServicioRepository;


@Service
public class ProfesionalServiceImpl implements ProfesionalService {
    @Autowired
    private ProfesionalRepository profesionalRepository;

    @Override
    public Profesional save(Profesional profesional) {
        return profesionalRepository.save(profesional);
    }

    @Override
    public Optional<Profesional> findById(Integer id) {
        return profesionalRepository.findById(id);
    }

    @Override
    public List<Profesional> findAll() {
        return profesionalRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        profesionalRepository.deleteById(id);
    }
}