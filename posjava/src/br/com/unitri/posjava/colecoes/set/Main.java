package br.com.unitri.posjava.colecoes.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Set<Funcionario> conjunto = new HashSet<Funcionario>();
		
		Funcionario f1 = new Funcionario("Funcionario 1", 1l);
		Funcionario f2 = new Funcionario("Funcionario 2", 1l);

		System.out.println(conjunto.add(f1));
		System.out.println(conjunto.add(f2));

		System.out.println(conjunto);
		
	}

}
