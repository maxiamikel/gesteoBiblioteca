package com.damapi.gestao_biblioteca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damapi.gestao_biblioteca.entities.Livro;
import com.damapi.gestao_biblioteca.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repo;

	public Livro obterLivroPorId(Long id) {
		Optional<Livro> obj = repo.findById(id);
		return obj.orElse(null);
	}

	public List<Livro> obterTodosOsLivros() {
		return repo.findAll();

	}

}
