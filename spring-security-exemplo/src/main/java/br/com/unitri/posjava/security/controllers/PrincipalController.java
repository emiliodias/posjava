package br.com.unitri.posjava.security.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/principal")
public class PrincipalController {
	
	
	@RequestMapping(value = "/index")
	public ModelAndView principal() {
		
		ModelAndView modelView = new ModelAndView("index");
		
		return modelView;
	}
	
	@RequestMapping(value = "/protegida")
	public ModelAndView protegida() {
		
		ModelAndView modelView = new ModelAndView("protegida");
		
		String usuario = SecurityContextHolder.getContext().getAuthentication().getName();
		
		modelView.addObject("usuario", usuario);
		
		List<SimpleGrantedAuthority> authorities = (List<SimpleGrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		
		modelView.addObject("permissoes", authorities);
		
		return modelView;
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping(value = "/permissoes")
	public ModelAndView permissoes() {
		
		ModelAndView modelView = new ModelAndView("permissoes");
		
		return modelView;
	}
	
}