package br.com.unitri.posjava.restful.webservicesrestful.resources;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.unitri.posjava.restful.webservicesrestful.representations.Aluno;
import br.com.unitri.posjava.restful.webservicesrestful.representations.TesteRepresentation;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class TesteResource {

	@RequestMapping(value="/teste", method={RequestMethod.GET}, 
			produces={"application/json", "application/xml"})
	public HttpEntity getTeste(@RequestParam("name") String name) {
		
		
		if( name.equals("Jose")) {
			
			TesteRepresentation rep = new TesteRepresentation("Hello World:  " + name + " - Get");
		
			return ResponseEntity.ok(rep);
		
		} else {
			
			ResponseEntity.status(HttpStatus.CREATED).build();
			
			return ResponseEntity.notFound().build();
			
		}
		
	}
	
	@RequestMapping(value="/teste", method={RequestMethod.POST})
	public String postTeste() {
		
		return "Hello World - Post";
		
	}
	
	@RequestMapping(value="/testeHipermedia", method={RequestMethod.POST})
	public Aluno testeHipermedia() {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Nome do aluno");
		aluno.setEndereco("Endereço do aluno");
		
		aluno.add(linkTo(methodOn(TesteResource.class).testeHipermedia()).withSelfRel());

		
		return aluno;
		
	}
	
}