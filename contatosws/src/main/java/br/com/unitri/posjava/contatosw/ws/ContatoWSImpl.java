package br.com.unitri.posjava.contatosw.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import br.com.unitri.posjava.contatosw.model.Contato;

@WebService(endpointInterface="br.com.unitri.posjava.contatosw.ws.ContatosWS")
public class ContatoWSImpl implements ContatosWS {

	public List<Contato> listaContatos() {
		
		Contato c1 = new Contato();
		c1.setNome("Contato 1");
		c1.setTelefone("1111111111");
		
		Contato c2 = new Contato();
		c2.setNome("Contato 2");
		c2.setTelefone("222222222");
		
		Contato c3 = new Contato();
		c3.setNome("Contato 3");
		c3.setTelefone("333333333");
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		contatos.add(c1);
		contatos.add(c2);
		contatos.add(c3);
		
		return contatos;
	}

}
