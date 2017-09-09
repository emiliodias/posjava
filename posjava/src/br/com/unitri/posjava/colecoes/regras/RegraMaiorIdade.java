package br.com.unitri.posjava.colecoes.regras;

public class RegraMaiorIdade implements Regra {

	@Override
	public boolean verifica(Cliente c, Produto p) {
		
		if(c.getIdade() < 18)	
			return false;
		
		return true;
	}

}
