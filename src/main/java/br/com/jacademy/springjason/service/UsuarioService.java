package br.com.jacademy.springjason.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jacademy.springjason.model.Usuario;
import br.com.jacademy.springjason.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;

	public void valid(Usuario user) {
		if (user.getNome() == null || user.getNome() == "") {
			throw new IllegalArgumentException("Nome não foi informado");
		}
	}

	public void save(Usuario user) {
		valid(user);
		repository.save(user);

	}

}
