package br.com.unitri.posjava.annotations.main;

import br.com.unitri.posjava.annotations.minhaapi.Campo;
import br.com.unitri.posjava.annotations.minhaapi.Tabela;

@Tabela(nome = "alunos")
public class Aluno {
	
	@Campo(nome = "id")
	public Integer id;
	
	@Campo(nome = "nome")
	public String nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}