package br.com.unitri.posjava.crud.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unitri.posjava.crud.domain.Aluno;
import br.com.unitri.posjava.crud.services.AlunosService;
import br.com.unitri.posjava.crud.view.dto.AlunoDTO;

@RestController
@RequestMapping("/alunos")
public class AlunosController {
	
	@Autowired
	private AlunosService alunosService;
	
	@RequestMapping(method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<AlunoDTO>> listar() {
		
		List<AlunoDTO> dtos = new ArrayList<AlunoDTO>();
		
		List<Aluno> alunos = alunosService.listar();
		
		for(Aluno a : alunos) {
			
			AlunoDTO dto = new AlunoDTO();
			dto.setId(a.getId());
			dto.setNome(a.getNome());
			dto.setEndereco(a.getEndereco());

			dtos.add(dto);
			
		}
		
				
		return ResponseEntity.ok(dtos);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> remover(@PathVariable("id") Long id) { 
		
		alunosService.remover(id);
		
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<AlunoDTO> buscar(@PathVariable("id") Long id) { 
		
		Aluno aluno = alunosService.buscar(id);
		
		if( aluno == null )
			return ResponseEntity.notFound().build();
		
		AlunoDTO dto = new AlunoDTO();
		dto.setEndereco(aluno.getEndereco());
		dto.setId(aluno.getId());
		dto.setNome(aluno.getNome());
		
		return ResponseEntity.ok(dto);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@RequestBody AlunoDTO alunoDTO) {
		
		Aluno aluno = new Aluno();
		aluno.setEndereco(alunoDTO.getEndereco());
		aluno.setId(alunoDTO.getId());
		aluno.setNome(alunoDTO.getNome());
		
		alunosService.salvar(aluno);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
}