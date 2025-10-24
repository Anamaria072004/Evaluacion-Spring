package com.spring.service;

import java.util.List;
import java.util.Optional;

import com.spring.model.Usuario;

public interface UsuarioService {
	Usuario save(Usuario usuario);
	Optional<Usuario> findById(Integer id);
	List<Usuario> findAll();
	void deleteById (Integer id);
}
