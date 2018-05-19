package br.com.unitri.posjava.optional;

import java.util.Optional;

public class Optional1 {
	
	public static void main(String[] args) {
		
		//Criando um optional vazio...
		Optional<String> empty = Optional.empty();
		
		/**
		 * Verificando se existe valor presente.
		 * retorna true caso exista e falso caso contrário.
		 */
		empty.isPresent();
		
		//Obtendo valor...
		
		String valor = empty.get();
		
	}

}
