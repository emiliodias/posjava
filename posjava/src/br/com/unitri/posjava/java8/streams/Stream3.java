package br.com.unitri.posjava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Stream3 {

	public static void main(String[] args) {

		BiFunction<String, Integer, Usuario> c = Usuario::new;

		List<Usuario> usuarios = Arrays.
				asList(c.apply("Usuario1", 10),   
					   c.apply("Usuario1", 20), 
					   c.apply("Usuario1", 2),
					   c.apply("Usuario1", 12));

		Integer response = usuarios.stream() //Obtem o stream
								   .filter(u -> u.getPontos() > 2) //Filtra os valores desejados
								   .map(Usuario::getPontos) //Mapeia os valores desejados
								   .reduce((i, prev) -> i + prev) //Reduz para a resposta desejada
								   .get(); //Obtem a resposta	

		System.out.println(response);
		
		//O código acima poderia ser traduzido em uma versão mais imperativa como:
		
		int total = 0;
		
		for(Usuario u : usuarios) {
			
			if(u.getPontos() > 2 ) {
				total = total + u.getPontos();
			}
			
		}
		
		System.out.println(total);

	}
	
	public Integer get() {
		return null;
	}

}
