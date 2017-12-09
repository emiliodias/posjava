package br.edu.unitri.posjava.desenvolvimentoweb.blog.controllers;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.unitri.posjava.desenvolvimentoweb.blog.domain.Post;
import br.edu.unitri.posjava.desenvolvimentoweb.blog.domain.User;
import br.edu.unitri.posjava.desenvolvimentoweb.blog.repository.PostRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private PostRepository postRepository;
	
	@RequestMapping("/cursojava")
	 public ModelAndView teste() {
		 
		ModelAndView teste = new ModelAndView("teste");
		
		teste.addObject("helloWorld", "Meu primeiro teste...");
		
		List<String> lista = new ArrayList<>();
		lista.add("Valor 1");
		lista.add("Valor 2");
		lista.add("Valor 3");
		
		teste.addObject("lista", lista);
		
		User user = new User();
		user.setUsername("aluno-java");
		user.setPassword("123456");
		
		teste.addObject("usuario", user);
		
		return teste;
		 
	 }
	

	 @RequestMapping("/novopost")
	 public ModelAndView novoPost() {
		 
		 return new ModelAndView("form");
		 
	 }
	
    @RequestMapping(value = "/newpost", method = RequestMethod.POST)
    public ModelAndView criaNovoPost(@ModelAttribute("post") Post post, BindingResult result, ModelMap model) {
    	
    	User user = new User();
    	user.setUsername("emilio");
    	
    	post.setDate(new Date());
    	post.setUser(user);
    	
    	postRepository.save(post);
    	
    	
       
        return new ModelAndView("redirect:/emilio/posts");

    }

}