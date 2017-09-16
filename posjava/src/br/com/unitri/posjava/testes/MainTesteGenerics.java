package br.com.unitri.posjava.testes;

public class MainTesteGenerics {

	public static void main(String[] args) {
		
		TesteGenerics<Integer> teste = new TesteGenerics<Integer>();
		
		teste.setValor(10);
		
		Integer inteiro = teste.getValor();
		
		teste.imprime();
		
	}
	
}
