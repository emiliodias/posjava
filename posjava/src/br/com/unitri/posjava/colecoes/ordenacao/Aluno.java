package br.com.unitri.posjava.colecoes.ordenacao;

public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	
	private Long matricula;
	
	public Aluno(){}
	
	public Aluno(String nome, Long matricula) {
		
		this.nome = nome;
		this.matricula = matricula;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
	}

	@Override
	public int compareTo(Aluno o) {
		
		return this.getNome().compareTo(o.getNome());
		
	}

}
