package br.com.unitri.posjava.userstorews.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unitri.posjava.userstorews.domain.Usuario;
import br.com.unitri.posjava.userstorews.services.UsuarioService;
import br.com.unitri.posjava.userstorews.view.dto.UsuarioDTO;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/autenticar", method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@RequestBody UsuarioDTO alunoDTO) {
		
		Usuario usuario = new Usuario();
		usuario.setUsername(alunoDTO.getUsername());
		usuario.setPassword(alunoDTO.getPassword());
		
		boolean resposta = usuarioService.autenticar(usuario);
		
		if(resposta == true)
			return ResponseEntity.status(HttpStatus.OK).build();
		else 
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
			
	}
	
}