package com.damapi.gestao_biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damapi.gestao_biblioteca.entities.Livro;
import com.damapi.gestao_biblioteca.services.LivroService;

@RestController
@RequestMapping("/api/livros")
public class LivroController {
	
	@Autowired
	private LivroService service;

	@GetMapping("/{id}")
	public ResponseEntity<Livro> getLivroId(@PathVariable Long id){
		Livro livro = service.obterLivroPorId(id);
		return ResponseEntity.ok().body(livro);
	}
}
