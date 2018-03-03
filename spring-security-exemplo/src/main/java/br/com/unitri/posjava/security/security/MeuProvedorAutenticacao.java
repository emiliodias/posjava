package br.com.unitri.posjava.security.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class MeuProvedorAutenticacao implements AuthenticationProvider {

	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		
		String username = authentication.getName();
	        
	    String password = authentication.getCredentials().toString();
		
		
		/*
		 * Implementa lógica de validação de usuário.
		 * 
		 * Você pode pegar o usuário e senha e ir no banco de dados
		 * por exemplo.
		 * 
		 */
		
		List<GrantedAuthority> authorities = new ArrayList<>();
        
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(null, null, authorities);
        
        return token;
		
	}

	public boolean supports(Class<?> authentication) {
		
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
		
	}

}
