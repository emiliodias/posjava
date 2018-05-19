package br.com.unitri.posjava.optional;

import java.util.Optional;

public class Optional4 {
	
	public static void main(String[] args) {
		
		
		//Possibilidade de Nullpointer....
		Integer tamanho = getNome().length();
		
		//Solução...
		
		String nome = getNome();
		
		if(nome != null) {
			tamanho = getNome().length();
		} else {
			tamanho = 0;
		}
			
		//Com Options...
		
		Optional<String> nome2 = getNome2();
		
		
		nome2.ifPresent(n -> System.out.println(n.length()));
		
	}
	
	public static String getNome() {
		
		return "Nome";
		
	}
	
	public static Optional<String> getNome2() {
		
		return Optional.of("Nome");
		
	}

}
