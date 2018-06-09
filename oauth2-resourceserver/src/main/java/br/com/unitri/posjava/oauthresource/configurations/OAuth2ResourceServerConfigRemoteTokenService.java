package br.com.unitri.posjava.oauthresource.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfigRemoteTokenService extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(final HttpSecurity http) throws Exception {
        
                http.authorizeRequests().anyRequest().authenticated();
       
    }

    @Primary
    @Bean
    public RemoteTokenServices tokenServices() {
    	
        RemoteTokenServices tokenService = new RemoteTokenServices();
        tokenService.setCheckTokenEndpointUrl("http://localhost:8090/oauth/check_token");
        tokenService.setClientId("admin");
        tokenService.setClientSecret("nimda");
        
        return tokenService;
    }

}