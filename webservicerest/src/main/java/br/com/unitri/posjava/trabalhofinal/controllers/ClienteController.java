package br.com.unitri.posjava.trabalhofinal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unitri.posjava.trabalhofinal.model.Cliente;
import br.com.unitri.posjava.trabalhofinal.repository.ClienteRepository;

@RestController
@RequestMapping("clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Cliente cliente) {
	
		repository.save(cliente);
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Cliente> lista() {
		
		return repository.findAll();
		
	}
	
}
