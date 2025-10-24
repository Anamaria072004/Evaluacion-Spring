package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Servicio;
import com.spring.repository.ServicioRepository;


@Service
public class ServicioServiceImpl implements ServicioService {
    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public Servicio save(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    @Override
    public Optional<Servicio> findById(Integer id) {
        return servicioRepository.findById(id);
    }

    @Override
    public List<Servicio> findAll() {
        return servicioRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        servicioRepository.deleteById(id);
    }

}