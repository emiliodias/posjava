package br.com.unitri.desenvolvimentoweb.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unitri.desenvolvimentoweb.domain.Aluno;;

@RestController
public class WSAlunosController {
	
	@RequestMapping(value="/wsalunos", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Aluno> alunos(ModelMap model) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Nome do Aluno");
		aluno.setEndereco("Endereço do Aluno");
		
		return ResponseEntity.status(HttpStatus.OK).body(aluno);

		
	}

}