package br.com.unitri.posjava.userstorews.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unitri.posjava.userstorews.domain.Usuario;
import br.com.unitri.posjava.userstorews.repository.UsuariosRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuariosRepository repository;
	
	public boolean autenticar(Usuario usuario) {
		
		Usuario u = repository.buscar(usuario.getUsername());
		
		if(u == null)
			return false;
		
		if(u.getPassword().equals(usuario.getPassword()))
			return true;
		
		return false;
		
	}
	
}