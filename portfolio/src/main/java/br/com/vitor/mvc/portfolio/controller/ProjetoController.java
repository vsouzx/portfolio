package br.com.vitor.mvc.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("projetos")
public class ProjetoController {
	
	@GetMapping("listar")
	public String projetos() {
		return "projetos/listar.html";
	}
}
