package br.com.unitri.posjava.java8.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Loops {
	
	public static void main(String[] args) {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		//Primeira forma de iteração
		
		for(int i=0;i<usuarios.size();i++) {
			System.out.println(usuarios.get(i).getNome());
		}
		
		//Utilizando um foreach
		
		for(Usuario u : usuarios) {
			System.out.println(u.getNome());
		}
		
		//Agora mais uma maneira...
		
		usuarios.forEach(new Consumer<Usuario>() {

			@Override
			public void accept(Usuario t) {
				System.out.println(t.getNome());
			}
			
		});
		
		Impressora impressora = new Impressora();
		
		usuarios.forEach(impressora);
		
		//E com o lambda...
		
		Consumer<Usuario> consumer = (Usuario u) -> System.out.println(u.getNome());
		
		usuarios.forEach(consumer);
		
		//Mais resumido...
		
		usuarios.forEach((Usuario u) -> {System.out.println(u.getNome());});
		
		//Mais resumido ainda...
		
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
	}

}
