package com.curso;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Curso {
	private static final Logger LOG = LoggerFactory.getLogger(Curso.class);
	public String ExibirValor() {
		LOG.info("O curso está aqui");
		LOG.warn("Está chegando aqui, cuidado!");
		return "1994";
	}
	
	
}
