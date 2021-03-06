package br.com.unitri.posjava.exemplocompleto.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import br.com.unitri.posjava.exemplocompleto.security.WSAuthenticationProvider;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private WSAuthenticationProvider authProvider;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	/*	
		auth.inMemoryAuthentication()
		.withUser("admin").password("123456")
		.authorities("ROLE_USER");*/
		
		auth.authenticationProvider(authProvider);
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.
			authorizeRequests().anyRequest().authenticated().
			and().
				formLogin().defaultSuccessUrl("/index");
		
	}

	
	
}
