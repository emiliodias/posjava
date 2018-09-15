package br.com.unitri.posjava.contatosws2.ws;

import java.util.List;

import javax.jws.WebService;

import br.com.unitri.posjava.contatosws2.model.Contato;

@WebService
public interface ContatosWS2 {

	public List<Contato> listaContatos();
	
}
