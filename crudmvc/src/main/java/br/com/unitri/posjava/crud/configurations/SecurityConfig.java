package br.com.unitri.posjava.crud.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import br.com.unitri.posjava.crud.security.WSAuthenticationProvider;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private WSAuthenticationProvider authProvider;
	
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.authenticationProvider(authProvider);

	}

	@Override
	public void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().
				and().
					authorizeRequests().anyRequest().authenticated().
				and().
					formLogin().
					defaultSuccessUrl("/alunos").
				and().
				csrf().disable();
		
			
	}

	
	
	
}