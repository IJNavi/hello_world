package com.objetivosAprendizagemDaSemana.objetivosAprendizagemDaSemana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos-de-aprendizagem-da-semana")
public class objetivosAprendizagemDaSemanaController {
	@GetMapping
	public String helloWorld() {
		return "Queries avançadas de SQL no MySQL,"
				+ " Métodos HTTP como GET, POST, PUT e DELETE;"
				+ " Consumo de APIs,"
				+ " Estrutura MVC,"
				+ "	Testes de requesições através do Insomia,"
				+ " Entre outros.";
	}

}
