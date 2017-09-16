package br.com.unitri.posjava.app;

import java.util.HashMap;
import java.util.Map;

public class GenericDAO<T, ID> {
	
	private Map<ID, T> dados = new HashMap<ID, T>();
	
	public void salva(T t, ID id) {
		
		dados.put(id, t);
	}
	
	public T buscaPedido(ID id) {
		
		return dados.get(id);
	}
	
	public void removePedido(ID id) {
		
		dados.remove(id);
	}
 
}
