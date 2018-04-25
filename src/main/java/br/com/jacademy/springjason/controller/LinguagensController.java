package br.com.jacademy.springjason.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jacademy.springjason.model.Linguagem;

@RestController
@RequestMapping(value = "/linguagens/")
public class LinguagensController {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Linguagem> listUsuario() {

		List<Linguagem> linguagens = new ArrayList<>();
		linguagens.add(new Linguagem("PHP"));
		linguagens.add(new Linguagem("JAVA SCRIPT"));
		linguagens.add(new Linguagem("GO"));

		return linguagens;
	}

}
