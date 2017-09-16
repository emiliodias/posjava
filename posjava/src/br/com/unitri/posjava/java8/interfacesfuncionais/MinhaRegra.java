package br.com.unitri.posjava.java8.interfacesfuncionais;

public class MinhaRegra implements Regra<Usuario>{

	@Override
	public boolean valida(Usuario usuario) {
		
		if(usuario.getPontos()>10)
			return true;
		
		return false;
	}

}