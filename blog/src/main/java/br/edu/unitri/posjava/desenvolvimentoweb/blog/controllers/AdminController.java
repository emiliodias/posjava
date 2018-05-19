package br.edu.unitri.posjava.desenvolvimentoweb.blog.controllers;
import java.util.Date;

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