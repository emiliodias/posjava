package br.com.unitri.posjava.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Optional5 {
	
	public static void main(String[] args) {
		
		//Obtem um optional de uma String, caso seja nula, obtem uma String com orElseGet
		
		Optional.ofNullable(getNome()).orElseGet(() -> "nome");
		
		//Obtem um optional de uma String, caso seja nula, obtem uma String com Else
		
		Optional.ofNullable(getNome()).orElse("nome");
		
		//Lançando exceções quando valor não é encontrado...
		
		Optional.ofNullable(getNome()).orElseThrow(new Supplier<RuntimeException>() {

			@Override
			public RuntimeException get() {
				
				return new IllegalArgumentException();
			}
		});
		
		//Lançando exceções quando valor não é encontrado... versão Lamda.
		
		Optional.ofNullable(getNome()).orElseThrow(() -> new IllegalArgumentException());
		
		//Lançando exceções quando valor não é encontrado... versão Methdod Referennce .
		
		Optional.ofNullable(getNome()).orElseThrow(IllegalArgumentException::new);
		
	}
	
	public static String getNome() {
		
		return null;
		
	}

}
