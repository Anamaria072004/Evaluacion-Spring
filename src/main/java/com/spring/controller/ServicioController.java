package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.spring.model.Servicio;
import com.spring.service.ServicioService;

@Controller
@RequestMapping("/servicios")
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @GetMapping("")
    public String listar(Model model) {
        model.addAttribute("servicios", servicioService.findAll());
        return "servicios/Servicioslista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("servicio", new Servicio());
        return "servicios/Serviciosformulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Servicio servicio) {
        servicioService.save(servicio);
        return "redirect:/servicios";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Servicio servicio = servicioService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Consulta no encontrada: " + id));
        model.addAttribute("servicio", servicio);
        return "servicios/Serviciosformulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        servicioService.deleteById(id);
        return "redirect:/servicios";
    }
}