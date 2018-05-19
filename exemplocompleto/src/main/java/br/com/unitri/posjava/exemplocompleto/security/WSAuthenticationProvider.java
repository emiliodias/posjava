package br.com.unitri.posjava.exemplocompleto.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WSAuthenticationProvider implements AuthenticationProvider {
	
	private static final String URL = "http://localhost:8080/userstorews/usuarios/autenticar";

	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		
		String username = authentication.getName();
	        
	    String password = authentication.getCredentials().toString();
		
	    UsuarioDTO usuario = new UsuarioDTO();
	    usuario.setPassword(password);
	    usuario.setUsername(username);
	    
	    RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Void> resposta = restTemplate.postForEntity(URL , usuario, Void.class);
		
		if(resposta.getStatusCode().is2xxSuccessful() == false) {
			throw new RuntimeException("Erro ao autenticar");
		}
		
		List<GrantedAuthority> authorities = new ArrayList<>();
        
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(usuario, null, authorities);
        
        return token;
		
	}

	public boolean supports(Class<?> authentication) {
		
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
		
	}

}
