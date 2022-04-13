package com.damapi.gestao_biblioteca.dto;

import com.damapi.gestao_biblioteca.entities.Livro;

public class LivroDTO {

	private Long id;
	private String titulo;
	public String idioma;

	public LivroDTO() {
		super();
		
	}

	public LivroDTO(Livro obj) {
		this.id = obj.getId();
		this.titulo = obj.getTitulo();
		this.idioma = obj.getIdioma();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
