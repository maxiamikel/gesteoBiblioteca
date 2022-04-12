package com.damapi.gestao_biblioteca;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.damapi.gestao_biblioteca.entities.Categoria;
import com.damapi.gestao_biblioteca.entities.Livro;
import com.damapi.gestao_biblioteca.repositories.CategoriaRepository;
import com.damapi.gestao_biblioteca.repositories.LivroRepository;

@SpringBootApplication
public class GestaoBibliotecaApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository cateR;
	@Autowired
	private LivroRepository livR;

	public static void main(String[] args) {
		SpringApplication.run(GestaoBibliotecaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica", "Todos os livros básicos de informatica para iniciantes");

		Livro li = new Livro(null, "Informatica Basica", "Principios iniciante para informatica", cat1);
		Livro li1 = new Livro(null, "Matematica para comoutacion", "Calculos e logi", cat1);
		Livro li2 = new Livro(null, "Teste", "Testar", cat1);
		cat1.getLivros().addAll(Arrays.asList(li, li1, li2));

		this.cateR.saveAll(Arrays.asList(cat1));
		this.livR.saveAll(Arrays.asList(li1, li, li2));
	}

}
