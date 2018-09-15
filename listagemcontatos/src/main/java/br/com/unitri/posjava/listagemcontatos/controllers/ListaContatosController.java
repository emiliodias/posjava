package br.com.unitri.posjava.listagemcontatos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.unitri.posjava.contatosw.ws.Contato;
import br.com.unitri.posjava.contatosw.ws.ContatoWSImplService;
import br.com.unitri.posjava.contatosw.ws.ContatosWS;

@Controller
public class ListaContatosController {

	@RequestMapping("/listagem")
	public ModelAndView listagem() {
		
		ModelAndView mv = new ModelAndView("lista");
		
		ContatoWSImplService service = new ContatoWSImplService();
		
		ContatosWS contatosWS = service.getContatoWSImplPort();
		
		List<Contato> listaContatos = contatosWS.listaContatos();
		
		//List<ContatoDTO> contatosDTO = new ArrayList<ContatoDTO>();
		
		mv.addObject("contatos", listaContatos);
		
		return mv;
	}
	
}
