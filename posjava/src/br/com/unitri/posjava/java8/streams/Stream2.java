package br.com.unitri.posjava.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {

		BiFunction<String, Integer, Usuario> c = Usuario::new;

		List<Usuario> usuarios = Arrays.asList(c.apply("Usuario1", 10), c.apply("Usuario1", 20),
				c.apply("Usuario1", 2), c.apply("Usuario1", 12), c.apply("Usuario1", 100), c.apply("Usuario1", 150));

		
		
		List<Usuario> novaLista = new ArrayList<Usuario>();
		
		usuarios.stream().filter(u -> u.getPontos() >= 20).forEach(novaLista::add);
		
		System.out.println(novaLista);
		
		//Outra maneira...
		
		List<Usuario> nova = usuarios.stream().filter(u -> u.getPontos() > 100).collect(Collectors.toList());
		
		List<Integer> pontos = usuarios.stream()
			    .map(Usuario::getPontos)
			    .collect(Collectors.toList());
		
		//filter -> retorna um booleano indicando se o elemento permanece ou não
		//map - > mapeia o valor encontrado para uma nova lista
		
	}

}