package br.com.unitri.posjava.colecoes.regras;

import java.util.List;

public class Venda {
	
	private List<Regra> regras;
	
	public Venda(List<Regra> regras) {
		
		this.regras =  regras;
		
	}
	
	public void vender(Cliente cliente, Produto produto) {
		
		for(Regra r : regras) {
			
			if(r.verifica(cliente, produto)== false) {
				throw new RuntimeException("As regras não atendem");
			}
			
		}
		
		System.out.println("Venda executada com sucesso.");
		
	}

}
