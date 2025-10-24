package com.spring.service;

import java.util.List;
import java.util.Optional;

import com.spring.model.Cita;
import com.spring.model.Profesional;
import com.spring.model.Servicio;
import com.spring.model.Usuario;

public interface ServicioService {
   Servicio save(Servicio servicio);
   Optional<Servicio> findById(Integer id);
   List<Servicio>findAll();
   void deleteById(Integer id);

}
