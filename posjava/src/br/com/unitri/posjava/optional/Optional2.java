package br.com.unitri.posjava.optional;

import java.util.Optional;

public class Optional2 {
	
	public static void main(String[] args) {
		
		String v = null; 
		
		//Criando um optional a partir de um valor NULL...Irá lançar um NullPointerException
		
		try {
			Optional<String> empty = Optional.of(v);
		} catch (NullPointerException e) {
			
			System.out.println("Obteve um nullpointer: " + e.getMessage());
			
		}
		
		//Solução...
		
		Optional<String> emptyNullable = Optional.ofNullable(v);
		
	}

}
