package br.com.unitri.desenvolvimentoweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	@RequestMapping("/helloworld")
	public String helloWorld(ModelMap model) {
		
		return "helloWorld";
		
	}
	
}