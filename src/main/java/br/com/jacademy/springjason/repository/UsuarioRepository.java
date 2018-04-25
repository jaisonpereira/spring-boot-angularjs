package br.com.jacademy.springjason.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.jacademy.springjason.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

}
