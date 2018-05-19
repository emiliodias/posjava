package br.com.unitri.posjava.optional;

import java.util.Optional;

public class Optional3 {
	
	public static void main(String[] args) {
		
		//Criando um optional a partir de um valor...
		Optional<String> empty = Optional.of("Meu optional!");
		
		/**
		 * Verificando se existe valor presente.
		 * retorna true caso exista e falso caso contrário.
		 */
		boolean isPresent = empty.isPresent();
		
		String frase = isPresent == true ? "Valor é presente? Sim!!!" : "Valor é presente? Não!!!";
		
		System.out.println(frase);
		
		//Obtendo valor...
		
		String valor = empty.get();
		
		frase = String.format("Valor do optional: %s", valor);
		
		System.out.println(frase);
		
	}

}
