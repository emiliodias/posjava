package br.com.unitri.posjava.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {
	
	public static void main(String[] args) {
		
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Valor 1");
		lista.add("Valor 2");
		
		String valor = null;
		try {
			 valor = lista.get(2);
			 System.out.println(valor);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
