package br.com.unitri.posjava.colecoes.ordenacao;

import java.util.Comparator;

public class MeuComparador implements Comparator<Aluno> {

	@Override
	public int compare(Aluno o1, Aluno o2) {
		
		return o1.getNome().compareTo(o2.getNome());
		
	}

}
