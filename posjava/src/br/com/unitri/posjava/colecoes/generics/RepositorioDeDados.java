package br.com.unitri.posjava.colecoes.generics;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeDados<T> {

	private List dados = new ArrayList();
	
	public void salvar(T dado) {
		
		dados.add(dado);
		
	}
	
	public T busca(T dado) {
		
		int index = dados.indexOf(dado);
		
		if(index != -1)
			return (T)dados.get(index);
		
		return null;
		
	}
	
}
