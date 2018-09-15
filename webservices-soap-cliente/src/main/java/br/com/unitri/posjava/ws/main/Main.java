package br.com.unitri.posjava.ws.main;

import br.com.unitri.posjava.ws.Cliente;
import br.com.unitri.posjava.ws.ClienteWS;
import br.com.unitri.posjava.ws.ClienteWSImplService;



public class Main {

	public static void main(String[] args) {
		
		
		ClienteWS clienteWS = new ClienteWSImplService().getClienteWSImplPort();
		
		Cliente cliente = clienteWS.getCliente(1l);
		
		System.out.println("Id do cliente: " + cliente.getId());
		
		System.out.println("Nome do cliente: " + cliente.getNome());
		
		System.out.println("Endereço do cliente: " + cliente.getEndereco());
	}
	
}