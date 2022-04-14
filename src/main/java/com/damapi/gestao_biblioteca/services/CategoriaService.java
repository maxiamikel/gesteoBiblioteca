package com.damapi.gestao_biblioteca.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damapi.gestao_biblioteca.dto.CategoriaDTO;
import com.damapi.gestao_biblioteca.entities.Categoria;
import com.damapi.gestao_biblioteca.entities.Livro;
import com.damapi.gestao_biblioteca.repositories.CategoriaRepository;
import com.damapi.gestao_biblioteca.repositories.LivroRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	@Autowired
	private CategoriaRepository cateR;
	@Autowired
	private LivroRepository livR;

	public Categoria obterCategoriaPorId(Long id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado, " + id + " , Tipo: " + Categoria.class.getName(), null));
	}

	public void instanciarDB() {
		Categoria cat1 = new Categoria(null, "Informatica", "Todos os livros básicos de informatica para iniciantes");
		Categoria cat2 = new Categoria(null, "Ciencia exactas", "Categoria de todos los recursos exactos");

		Livro li = new Livro(null, "Informatica Basica", "Principios iniciante para informatica", cat1);
		Livro li1 = new Livro(null, "Matematica para comoutacion", "Calculos e logi", cat1);
		Livro li2 = new Livro(null, "Teste", "Testar", cat2);
		cat1.getLivros().addAll(Arrays.asList(li, li1, li2));

		this.cateR.saveAll(Arrays.asList(cat1, cat2));
		this.livR.saveAll(Arrays.asList(li1, li, li2));
	}

	public List<Categoria> getAllCategoria() {
		return repo.findAll();
	}

	public Categoria salvarCategoria(Categoria categoria) {
		categoria.setId(null);
		Categoria obj = repo.save(categoria);
		return obj;
	}

	public Categoria atualizarCategoria(Long id, CategoriaDTO objDTO) {
		Categoria obj = obterCategoriaPorId(id);
		obj.setDescripcao(obj.getDescripcao());
		obj.setNome(obj.getNome());
		return repo.save(obj);
	}

	

}
