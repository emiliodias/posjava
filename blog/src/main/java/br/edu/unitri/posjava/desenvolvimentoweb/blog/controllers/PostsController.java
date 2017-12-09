package br.edu.unitri.posjava.desenvolvimentoweb.blog.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.unitri.posjava.desenvolvimentoweb.blog.domain.Blog;
import br.edu.unitri.posjava.desenvolvimentoweb.blog.domain.Post;
import br.edu.unitri.posjava.desenvolvimentoweb.blog.domain.User;
import br.edu.unitri.posjava.desenvolvimentoweb.blog.repository.BlogRepository;
import br.edu.unitri.posjava.desenvolvimentoweb.blog.repository.PostRepository;

@Controller
public class PostsController {
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private PostRepository postRepository;

    @RequestMapping("/{username}/posts")
    public ModelAndView greeting(@PathVariable(value="username") String username) {
    	
    	Blog blog = blogRepository.findByUser(new User(username));
    	
    	if(blog == null)
    		return new ModelAndView("redirect:/404.html");
    	
    	
        List<Post> posts = postRepository.findByUser(new User(username));
        		
        ModelAndView modelView = new ModelAndView("index");
        
        modelView.addObject("blog", blog);
        modelView.addObject("posts", posts);
        
        return modelView;
        
    }

}