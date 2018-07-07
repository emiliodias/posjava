package br.com.unitri.posjava.trabalhofinal.soap.ws;

import java.util.List;

import javax.jws.WebService;

import br.com.unitri.posjava.trabalhofinal.soap.model.Cliente;
import br.com.unitri.posjava.trabalhofinal.soap.repository.ClienteRepository;

@WebService(endpointInterface = "br.com.unitri.posjava.trabalhofinal.soap.ws.ClienteWS")
public class ClienteWSImpl implements ClienteWS {
	
	private ClienteRepository repository;

	public void salvar(Cliente cliente) {
		
		Cliente c = repository.buscar(cliente.getId());
		
		if(c == null) {
			repository.salvar(cliente);
			
		}
		
	}

	public List<Cliente> listar() {
		
		return repository.listar();
	}

	public ClienteRepository getRepository() {
		return repository;
	}

	public void setRepository(ClienteRepository repository) {
		this.repository = repository;
	}	
	
}
