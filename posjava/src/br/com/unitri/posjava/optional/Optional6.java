package br.com.unitri.posjava.optional;

import java.util.Optional;

public class Optional6 {
	
	public static void main(String[] args) {
		
		//Filtrando respostas... Tome cuidado, pois o filtro pode retornar um objeto vazio...
		
		Integer optional = Optional.ofNullable(getValor()).filter(i -> i % 2 == 0).get();
		
		//Filtrando respostas... Tome cuidado, pois o filtro pode retornar um objeto vazio... valide sempre!!!
		
		Optional.ofNullable(getValor()).filter(i -> i % 2 == 0).isPresent();
		
		//Ou...
		
		Optional.ofNullable(getValor()).filter(i -> i % 2 == 0).ifPresent(i -> System.out.println(i));
		
	}
	
	public static Integer getValor() {
		
		return 2;
		
	}

}
