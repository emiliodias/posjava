package br.com.unitri.posjava.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		
		lista.add("Aluno 1");
		lista.add("Aluno 2");
		lista.add("Aluno 3");
		lista.add(0, 10);
		
		String valor = (String) lista.get(0);
		
		System.out.println(valor);
		
	}
	
}
