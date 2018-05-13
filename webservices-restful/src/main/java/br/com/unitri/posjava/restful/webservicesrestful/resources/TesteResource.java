package br.com.unitri.posjava.restful.webservicesrestful.resources;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.unitri.posjava.restful.webservicesrestful.representations.TesteRepresentation;

@RestController
public class TesteResource {

	@RequestMapping(value="/teste", method={RequestMethod.GET}, 
			produces={"application/json", "application/xml"})
	public HttpEntity getTeste(@RequestParam("name") String name) {
		
		if( name.equals("Jose")) {
			
			TesteRepresentation rep = new TesteRepresentation("Hello World:  " + name + " - Get");
		
			return ResponseEntity.ok(rep);
		
		} else {
			
			return ResponseEntity.notFound().build();
			
		}
		
	}
	
	@RequestMapping(value="/teste", method={RequestMethod.POST})
	public String postTeste() {
		
		return "Hello World - Post";
		
	}
	
}