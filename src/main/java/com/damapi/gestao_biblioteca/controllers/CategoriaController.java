package com.damapi.gestao_biblioteca.controllers;

import java.text.Collator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damapi.gestao_biblioteca.dto.CategoriaDTO;
import com.damapi.gestao_biblioteca.entities.Categoria;
import com.damapi.gestao_biblioteca.services.CategoriaService;

@RestController
@RequestMapping(value = "/api/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getPorId(@PathVariable Long id){
		Categoria obj = service.obterCategoriaPorId(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	@GetMapping
	public ResponseEntity<List<CategoriaDTO>> findAllCategoria(){
		List<Categoria> lista = service.getAllCategoria();
		List<CategoriaDTO> objDTO = lista.stream().map(obj -> new CategoriaDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(objDTO);
	}

}
