package com.damapi.gestao_biblioteca.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.damapi.gestao_biblioteca.services.CategoriaService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private CategoriaService service;
	
	@Bean
	public void instanciarDBA() {
		this.service.instanciarDB();
	}

}
