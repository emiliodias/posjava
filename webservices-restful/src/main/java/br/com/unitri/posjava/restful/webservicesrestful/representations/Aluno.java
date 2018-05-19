package br.com.unitri.posjava.restful.webservicesrestful.representations;

import org.springframework.hateoas.ResourceSupport;

public class Aluno extends ResourceSupport{

	private String nome;
	
	private String endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}