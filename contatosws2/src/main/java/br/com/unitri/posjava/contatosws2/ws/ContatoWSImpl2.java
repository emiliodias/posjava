package br.com.unitri.posjava.contatosws2.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import br.com.unitri.posjava.contatosws2.model.Contato;
import br.com.unitri.posjava.contatosws2.model.Contatos;

@WebService(endpointInterface="br.com.unitri.posjava.contatosws2.ws.ContatosWS2")
public class ContatoWSImpl2 implements ContatosWS2 {

	public List<Contato> listaContatos() {
		
		Contato c1 = new Contato();
		c1.setNome("Contato2 1");
		Contatos contatos1 = new Contatos();
		contatos1.setTelefone("1111111111");
		c1.setContatos(contatos1);
		
		Contato c2 = new Contato();
		c2.setNome("Contato2 2");
		Contatos contatos2 = new Contatos();
		contatos2.setTelefone("2222222222");
		c2.setContatos(contatos2);
		
		Contato c3 = new Contato();
		c3.setNome("Contato2 3");
		Contatos contatos3 = new Contatos();
		contatos3.setTelefone("333333333");
		c3.setContatos(contatos3);
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		contatos.add(c1);
		contatos.add(c2);
		contatos.add(c3);
		
		return contatos;
	}

}
