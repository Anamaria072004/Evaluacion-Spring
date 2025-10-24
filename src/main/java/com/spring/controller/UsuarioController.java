package com.spring.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.spring.model.Usuario;
import com.spring.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("")
    public String listar(Model model) {
        model.addAttribute("usuarios", usuarioService.findAll());
        return "usuarios/Usuarioslista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        Usuario usuario = new Usuario();
        usuario.setFechaRegistro(LocalDate.now().toString()); 
        model.addAttribute("usuario", usuario);
        return "usuarios/Usuariosformulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/usuarios";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Usuario usuario = usuarioService.findById(id).orElseThrow();
        model.addAttribute("usuario", usuario);
        return "usuarios/Usuariosformulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        usuarioService.deleteById(id);
        return "redirect:/usuarios";
    }
}