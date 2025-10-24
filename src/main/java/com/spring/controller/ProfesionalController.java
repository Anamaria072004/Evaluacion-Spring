package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.spring.model.Profesional;
import com.spring.service.ProfesionalService;

@Controller
@RequestMapping("/profesionales")
public class ProfesionalController {

    @Autowired
    private ProfesionalService profesionalService;

    @GetMapping("")
    public String listar(Model model) {
        model.addAttribute("profesionales", profesionalService.findAll());
        return "profesionales/Profesionaleslista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("profesional", new Profesional());
        return "profesionales/Profesionalesformulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Profesional profesional) {
        profesionalService.save(profesional);
        return "redirect:/profesionales";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Profesional profesional = profesionalService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Médico no encontrado: " + id));
        model.addAttribute("profesional", profesional);
        return "profesionales/Profesionalesformulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        profesionalService.deleteById(id);
        return "redirect:/profesionales";
    }
}