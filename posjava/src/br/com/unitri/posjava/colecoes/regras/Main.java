package br.com.unitri.posjava.colecoes.regras;

import java.util.ArrayList;
import java.util.List;

public class Main {
	   
	public static void main(String[] args) {
		
		List<Regra> regras = new ArrayList<Regra>();
		
		regras.add(new RegraMaiorIdade());
		regras.add(new RegraMaiorIdadeCerveja());
		
		Venda venda = new Venda(regras);
		
		Cliente c = new Cliente();
		c.setIdade(18);

		Produto p = new Produto();
		p.setNome("Cerveja");
		
		venda.vender(c, p);
		
	}

}
