package br.com.unitri.posjava.contatosw.ws;

import java.util.List;

import javax.jws.WebService;

import br.com.unitri.posjava.contatosw.model.Contato;

@WebService
public interface ContatosWS {

	public List<Contato> listaContatos();
	
}
