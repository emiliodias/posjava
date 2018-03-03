package br.com.unitri.posjava.security.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// @Autowired
	// private BllazonAuthenticationProvider authenticationProvider;

	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER");

		/*
		 * Configura seu próprio provedor de autenticação
		 */
		
		// auth.authenticationProvider(authenticationProvider);
		
		/*
		 * Configura serviço para que você detalhe a busca do usuário
		 */
		
		//auth.userDetailsService(myUserDetailService);
		
		/**
		 * Utiliza implementação básica do Spring Security para carregar informações
		 * do usuário no Banco de Dados. Neste caso, você deve utilizar o modelo
		 * de tabelas pré-estabelecidas pelo próprio Spring.
		 * 
		 */
		
		//auth.jdbcAuthentication();

	}

	@Override
	public void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().
				antMatchers("/principal/index").permitAll().
				and().
					authorizeRequests().anyRequest().authenticated().
				and().
					formLogin().
					defaultSuccessUrl("/index.html").permitAll().
				and().
				csrf().disable();
		
			
	}
	
	/*
	 * Abaixo um exemplo de configuração para validação de credenciais utilizando
	 * um LDAP. Você pode configurar os parametros conforme necessidade.
	 */
	
	/*
	 *
	
		@Override
		public void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth
				.ldapAuthentication()
					.userDnPatterns("cn={0},ou=users")
					.groupSearchBase("ou=groups")
					.contextSource(contextSource())
					.passwordCompare()
						.passwordEncoder(new LdapShaPasswordEncoder())
						.passwordAttribute("userPassword");
		}
	
		@Bean
		public DefaultSpringSecurityContextSource contextSource() {
			return  new DefaultSpringSecurityContextSource(Arrays.asList("ldap://localhost:10389/"), "dc=example,dc=com");
		}
	
	*/
	
}