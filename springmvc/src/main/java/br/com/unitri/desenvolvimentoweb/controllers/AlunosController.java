package br.com.unitri.desenvolvimentoweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.unitri.desenvolvimentoweb.domain.Aluno;

@Controller
@RequestMapping("/alunos")
public class AlunosController {
	
	@RequestMapping(value="/form")
	public ModelAndView form(ModelMap model) {
		
		 return new ModelAndView("form", "aluno", new Aluno());
		
	}

	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public void salvar(@ModelAttribute("employee")Aluno aluno) {
		
		System.out.println("nome: " + aluno.getNome());
		
		System.out.println("nome: " + aluno.getEndereco());
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ModelAndView get(@PathVariable("id") Long id, ModelMap model) {
		
		System.out.println(String.format("Buscando aluno com ID %s", id));
		
		Aluno aluno = new Aluno();
		aluno.setNome(String.format("Aluno com ID: %s", id));
		aluno.setEndereco("Endereço do aluno");
		
		return new ModelAndView("aluno", "aluno", aluno);
		
	}
	
}