package br.com.unitri.posjava.trabalhofinal.scheduller.sh;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.unitri.posjava.trabalhofinal.soap.ws.ClienteWS;
import br.com.unitri.posjava.trabalhofinal.soap.ws.ClienteWSImplService;

@Component
public class ImplementacaoDoScheduller {

	@Scheduled(fixedDelay = 1000)
	public void scheduller() {
		
		String URL = "http://localhost:8081/clientes";
		
		System.out.println("Buscando dados no sistema Rest");
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<Cliente>> response =
		        restTemplate.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Cliente>>() {
		            });
		List<Cliente> clientes = response.getBody();
		
		for(Cliente c : clientes) {
			
			System.out.println("Nome do cliente: " + c.getNome());
			System.out.println("Salvando cliente.");
			salvarNoWSSOPA(c);
			System.out.println("Cliente salvo.");
			
		}
		
		System.out.println("Finalizando busca de dados no sistema Rest");
	}
	
	public void salvarNoWSSOPA(Cliente cliente) {
		
		ClienteWS wsservice = new ClienteWSImplService().getClienteWSImplPort();
		
		br.com.unitri.posjava.trabalhofinal.soap.ws.Cliente c = 
				new br.com.unitri.posjava.trabalhofinal.soap.ws.Cliente();
		
		c.setCpf(cliente.getCpf());
		c.setEndereco(cliente.getEndereco());
		c.setId(cliente.getId());
		c.setNascimento(cliente.getNascimento());
		c.setNome(cliente.getNome());
		c.setRg(cliente.getRg());
		c.setTelefone(cliente.getTelefone());
		
		wsservice.salvar(c);
		
		
	}
	
}
