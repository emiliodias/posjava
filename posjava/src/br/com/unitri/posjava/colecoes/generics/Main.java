package br.com.unitri.posjava.colecoes.generics;

public class Main {

	public static void main(String[] args) {
		
		RepositorioDeDados<String> repositorio = new RepositorioDeDados<String>();
		
		repositorio.salvar("Valor 1");
		repositorio.salvar("1");
		
		String dado = repositorio.busca("1");
		
		System.out.println(dado);
		
	}
	
}
