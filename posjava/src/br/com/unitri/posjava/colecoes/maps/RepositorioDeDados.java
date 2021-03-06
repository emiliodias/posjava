package br.com.unitri.posjava.colecoes.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositorioDeDados {

	private Map<String, List<Cliente>> dados = new HashMap<String, List<Cliente>>();
	
	public RepositorioDeDados() {
		
		dados.put("FISICA", new ArrayList<Cliente>());
		dados.put("JURIDICA", new ArrayList<Cliente>());
		
	}
	
	public void salvar(Cliente cliente) {
		
		String tipo = cliente.getTipo();
		
		dados.get(tipo).add(cliente);
		
	}
	
	public Cliente buscar(Cliente cliente) {
		
		List<Cliente> clientes = dados.get(cliente.getTipo());
		
		Integer index = clientes.indexOf(cliente);
		
		if(index != -1)
			return clientes.get(index);
		
		return null;
		
	}
	
	public void imprimeClientes() {
		
		System.out.println(dados);
		
	}
	
}
