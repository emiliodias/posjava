package br.com.unitri.posjava.colecoes.regras;

public class RegraMaiorIdadeCerveja implements Regra {

	@Override
	public boolean verifica(Cliente c, Produto p) {
		
		if(c.getIdade() < 21 && p.getNome().equalsIgnoreCase("Cerveja"))	
			return false;
		
		return true;
	}

}
