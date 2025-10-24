package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Cita;
import com.spring.service.CitaService;
import com.spring.service.ProfesionalService;
import com.spring.service.ServicioService;
import com.spring.service.UsuarioService;




@Controller
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ServicioService servicioService;

    @Autowired
    private ProfesionalService profesionalService;

    @GetMapping("")
    public String listar(Model model) {
        model.addAttribute("citas", citaService.findAll());
        return "citas/Citaslista";
    }

    @GetMapping("/nueva")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cita", new Cita());
        model.addAttribute("usuarios", usuarioService.findAll());
        model.addAttribute("servicios", servicioService.findAll());
        model.addAttribute("profesionales", profesionalService.findAll());
        return "citas/Citasformulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Cita cita) {
        citaService.save(cita);
        return "redirect:/citas";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Cita cita = citaService.findById(id).orElseThrow();
        model.addAttribute("cita", cita);
        model.addAttribute("usuarios", usuarioService.findAll());
        model.addAttribute("servicios", servicioService.findAll());
        model.addAttribute("profesionales", profesionalService.findAll());
        return "citas/Citasformulario";
    }
    

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        citaService.deleteById(id);
        return "redirect:/citas";
    }
}