package br.com.unitri.posjava.threads;

public class Sequencial {
	
	public static void main(String[] args) {
		
		//Impressão sequêncial
		
		Impressora impressora = new Impressora();
		
		impressora.imprime(0, 100);
		
		impressora.imprime(101, 200);
		
		impressora.imprime(201, 300);
		
	}

}