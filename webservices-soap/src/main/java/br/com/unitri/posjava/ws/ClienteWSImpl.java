package br.com.unitri.posjava.ws;

import br.com.unitri.posjava.model.Cliente;

public class ClienteWSImpl implements ClienteWS {

	public Cliente getCliente(Long id) {
		
		Cliente c = new Cliente();
		c.setEndereco("Endereço 1");
		c.setId(id);
		c.setNome("Nome 1");
		
		return c;
	}

	public void salvar(Cliente cliente) {
		
		System.out.println(cliente);
		
	}

}
