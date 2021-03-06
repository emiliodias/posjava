package br.com.unitri.posjava.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Stream1 {

	public static void main(String[] args) {

		BiFunction<String, Integer, Usuario> c = Usuario::new;

		List<Usuario> usuarios = Arrays.asList(c.apply("Usuario1", 10), c.apply("Usuario1", 20),
				c.apply("Usuario1", 2), c.apply("Usuario1", 12));

		
		usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
		
		usuarios.subList(0, 3).forEach(u -> System.out.println(u.getPontos()));
		
	}

}

/**
 * 
 *  Collections.sort(usuarios, new Comparator<Usuario>() {
    @Override
    public int compare(Usuario u1, Usuario u2) {
        return u1.getPontos() - u2.getPontos();
} });
Collections.reverse(usuarios);
List<Usuario> top10 = usuarios.subList(0, 10);
for(Usuario usuario : top10) {
    usuario.tornaModerador();
}
 * 
 */
