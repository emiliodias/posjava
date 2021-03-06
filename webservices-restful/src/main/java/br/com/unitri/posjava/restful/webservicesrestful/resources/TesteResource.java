package br.com.unitri.posjava.restful.webservicesrestful.resources;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.concurrent.TimeUnit;

import javax.validation.Valid;

import org.springframework.http.CacheControl;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.unitri.posjava.restful.webservicesrestful.representations.Aluno;
import br.com.unitri.posjava.restful.webservicesrestful.representations.TesteRepresentation;

@RestController
public class TesteResource {

	@RequestMapping(value="/teste", method={RequestMethod.GET}, 
			produces={"application/json", "application/xml"})
	public HttpEntity getTeste(@RequestParam(value="name", required=false, defaultValue="Jose") String name) {
		
		
		if( name.equals("Jose")) {
			
			TesteRepresentation rep = new TesteRepresentation("Hello World:  " + name + " - Get");
		
			return ResponseEntity.ok(rep);
		
		} else {
			
			ResponseEntity.status(HttpStatus.CREATED).build();
			
			return ResponseEntity.notFound().build();
			
		}
		
	}
	
	@RequestMapping(value="/testeAula", method={RequestMethod.POST})
	public HttpEntity postTeste(@Valid @RequestBody TesteRepresentation rep) {
		
		System.out.println("Body recebido: " + rep.toString());
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand("1").toUri();
		
		
		return ResponseEntity.created(uri).build();
		
	}
	
	@RequestMapping(value="/testeAula", method={RequestMethod.GET},
			produces={MediaType.APPLICATION_JSON_VALUE})
	public HttpEntity gettingTeste() {
		
		CacheControl cacheControl = CacheControl.maxAge(30, TimeUnit.SECONDS);
		
		TesteRepresentation rep = new TesteRepresentation("Hello World:  JSON MEDIA TYPE");
		
		return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(rep);
		
	}
	
	@RequestMapping(value="/testeAula/{id}", method={RequestMethod.GET},
			produces={MediaType.APPLICATION_JSON_VALUE})
	public HttpEntity gettingTeste(@PathVariable("id") String id) {
		
		if(id.equals("10")) {
		
			TesteRepresentation rep = 
					new TesteRepresentation("Hello World:  " + id);
			
			return ResponseEntity.ok(rep);
			
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		
		}
		
	}
	
	/*@RequestMapping(value="/testeAula", method={RequestMethod.GET},
			produces={MediaType.APPLICATION_XML_VALUE})
	public TesteRepresentation gettingTesteXML(@RequestBody TesteRepresentation representation) {
		
		TesteRepresentation rep = new TesteRepresentation("Hello World:  XML MEDIA TYPE");
		
		return rep;
		
	}*/
	
	
	
	@RequestMapping(value="/testeHipermedia", method={RequestMethod.DELETE})
	public Aluno testeHipermedia2() {
		
		return null;
	}
	
	@RequestMapping(value="/testeHipermedia", method={RequestMethod.GET})
	public Aluno testeHipermedia() {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Nome do aluno");
		aluno.setEndereco("Endereço do aluno");
		
		aluno.add(linkTo(methodOn(TesteResource.class).testeHipermedia()).withSelfRel());
		
		aluno.add(linkTo(methodOn(TesteResource.class).testeHipermedia2()).withRel("delete"));

		
		return aluno;
		
	}
	
}