package br.com.unitri.posjava.security.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
 
 
    @Override
    public UserDetails loadUserByUsername(String username) {
    	
      /**
       * 
       *  Você pode carregar informações detalhadas do usuário
       *  antes que ele seja colocado na sessão.
       * 
       */
    	
        return null;
    }
}