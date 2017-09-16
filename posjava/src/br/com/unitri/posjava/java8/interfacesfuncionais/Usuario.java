package br.com.unitri.posjava.java8.interfacesfuncionais;

public class Usuario {

	private String nome;
	private int pontos;
	private boolean moderador;

	public Usuario() {}
	
	public Usuario(String nome, int pontos) {
		this.pontos = pontos;
		this.nome = nome;
		this.moderador = false;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void tornaModerador() {
		this.moderador = true;
	}

	public boolean isModerador() {
		return moderador;
	}
}