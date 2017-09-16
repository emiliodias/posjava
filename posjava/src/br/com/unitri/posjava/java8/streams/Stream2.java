package br.com.unitri.posjava.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Stream2 {

	public static void main(String[] args) {

		BiFunction<String, Integer, Usuario> c = Usuario::new;

		List<Usuario> usuarios = Arrays.asList(c.apply("Usuario1", 10), 
				c.apply("Usuario1", 20), c.apply("Usuario1", 2),
				c.apply("Usuario1", 12), c.apply("Usuario1", 100), 
				c.apply("Usuario1", 150));

		List<Usuario> novaLista = new ArrayList<Usuario>();
		
		Predicate<Usuario> regraFiltro = new Predicate<Usuario>() {

			@Override
			public boolean test(Usuario u) {
				return u.getPontos() >= 20;
			}
			
		};
		
		Consumer<Usuario> consumer = new Consumer<Usuario>() {

			@Override
			public void accept(Usuario u) {
				novaLista.add(u);
			}
		};

		//usuarios.stream().filter(u -> u.getPontos() >= 20).forEach(novaLista::add);

		usuarios.stream().filter(regraFiltro).forEach(consumer);
		
		System.out.println(novaLista);

	}

}
