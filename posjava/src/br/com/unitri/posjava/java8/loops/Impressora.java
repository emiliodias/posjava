package br.com.unitri.posjava.java8.loops;

import java.util.function.Consumer;

public class Impressora implements Consumer<Usuario>{

	@Override
	public void accept(Usuario usuario) {
		
		System.out.println(usuario.getNome());
	}

}
