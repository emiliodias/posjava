package br.com.unitri.posjava.colecoes.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		Aluno a1 = new Aluno("Zezin", 1l);
		Aluno a2 = new Aluno("Maria", 2l);

		alunos.add(a1);
		alunos.add(a2);
		
		/*MeuComparador comparador = new MeuComparador();
		
		alunos.sort(comparador);

		alunos.sort(new Comparator<Aluno>() {

			@Override
			public int compare(Aluno o1, Aluno o2) {
				
				return o1.getNome().compareTo(o2.getNome());
				
			}
		});*/
		
		Collections.sort(alunos);

		System.out.println(alunos);

	}

}