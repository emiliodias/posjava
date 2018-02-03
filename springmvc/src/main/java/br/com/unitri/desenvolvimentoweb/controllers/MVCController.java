package br.com.unitri.desenvolvimentoweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.unitri.desenvolvimentoweb.exceptions.PosJavaUnitriException;

@Controller
public class MVCController {

	@RequestMapping("/lista")
	public String helloWorld(ModelMap model) {
		
		List<String> valores = new ArrayList<String>();
		valores.add("valor1");
		valores.add("valor2");
		valores.add("valor3");
		
		model.addAttribute("teste", valores);
		
		return "lista";
		
	}
	
	@RequestMapping("/exception")
	public void exception(ModelMap model) {
		
		throw new PosJavaUnitriException();
		
	}
	
}