package com.damapi.gestao_biblioteca.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String descripcao;
	
	@ManyToOne
	private List<Livro> livros = new ArrayList<>();

	public Categoria() {
		super();
		
	}

	public Categoria(Long id, String descripcao) {
		super();
		this.id = id;
		this.descripcao = descripcao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcao() {
		return descripcao;
	}

	public void setDescripcao(String descripcao) {
		this.descripcao = descripcao;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
}
