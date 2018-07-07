package br.com.unitri.posjava.trabalhofinal.soap.ws;

import java.util.List;

import javax.jws.WebService;

import br.com.unitri.posjava.trabalhofinal.soap.model.Cliente;

@WebService
public interface ClienteWS {
	
	public void salvar(Cliente cliente);
	
	public List<Cliente> listar();

}
