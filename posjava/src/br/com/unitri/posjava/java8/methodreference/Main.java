package br.com.unitri.posjava.java8.methodreference;

import java.util.function.BiFunction;

public class Main {
	
	public static void main(String[] args) {
		
		Supplier<Usuario> supplier = Usuario::new;
		
		Usuario u = supplier.get();
		
		BiFunction<String, Integer, Usuario> s = Usuario::new;
		
		Usuario usuario = s.apply("Emilio Dias", 1);
		
	}

}
