package br.com.unitri.posjava.crud.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.unitri.posjava.crud.domain.Aluno;
import br.com.unitri.posjava.crud.exceptions.CampoObrigatorioException;
import br.com.unitri.posjava.crud.services.AlunosService;
import br.com.unitri.posjava.crud.view.dto.AlunoDTO;

@Controller
@RequestMapping("/alunos")
public class AlunosController {
	
	@Autowired
	private AlunosService alunosService;
	
	@RequestMapping
	public ModelAndView principal(ModelMap model) {
		
		List<AlunoDTO> dtos = new ArrayList<AlunoDTO>();
		
		ModelAndView modelView = new ModelAndView("alunos");
		
		List<Aluno> alunos = alunosService.listar();
		
		for(Aluno a : alunos) {
			
			AlunoDTO dto = new AlunoDTO();
			dto.setId(a.getId());
			dto.setNome(a.getNome());
			
			String[] endereco = a.getEndereco().split(",");
			
			if(endereco.length == 3) {
			 
				dto.setEndereco(endereco[0].trim());
				dto.setComplemento(endereco[1].trim());
				dto.setEstado(endereco[2].trim());
			
			} else {
				
				dto.setEndereco(endereco[0].trim());
				dto.setEstado(endereco[1].trim());
				
			}
			
			dtos.add(dto);
		}
		
		modelView.addObject("alunos", dtos);
		modelView.addObject("aluno", new AlunoDTO());
				
		return modelView;
	}
	
	
	@RequestMapping(value = "/remover")
	public ModelAndView remover(@RequestParam("id") Long id) {
		
		ModelAndView modelView = new ModelAndView("alunos");
		
		alunosService.remover(id);
		
		List<Aluno> alunos = alunosService.listar();
		
		List<AlunoDTO> dtos = new ArrayList<AlunoDTO>();
		
		for(Aluno a : alunos) {
			
			AlunoDTO dto = new AlunoDTO();
			dto.setId(a.getId());
			dto.setNome(a.getNome());
			
			String[] endereco = a.getEndereco().split(",");
			
			if(endereco.length == 3) {
			 
				dto.setEndereco(endereco[0].trim());
				dto.setComplemento(endereco[1].trim());
				dto.setEstado(endereco[2].trim());
			
			} else {
				
				dto.setEndereco(endereco[0].trim());
				dto.setEstado(endereco[1].trim());
				
			}
			
			dtos.add(dto);
		}
		
		modelView.addObject("alunos", dtos);
		modelView.addObject("aluno", new AlunoDTO());
		
		return modelView;
	}
	
	@RequestMapping(value = "/editar")
	public ModelAndView editar(@RequestParam("id") Long id) {
		
		ModelAndView modelView = new ModelAndView("alunos");
		
		Aluno aluno = alunosService.buscar(id);
		
		AlunoDTO alunoDTO = new AlunoDTO();
		alunoDTO.setId(aluno.getId());
		alunoDTO.setNome(aluno.getNome());
		
		
		
		String[] e = aluno.getEndereco().split(",");
		
		if(e.length == 3) {
		 
			alunoDTO.setEndereco(e[0].trim());
			alunoDTO.setComplemento(e[1].trim());
			alunoDTO.setEstado(e[2].trim());
		
		} else {
			
			alunoDTO.setEndereco(e[0].trim());
			alunoDTO.setEstado(e[1].trim());
			
		}
		
		List<Aluno> alunos = alunosService.listar();
		
		List<AlunoDTO> dtos = new ArrayList<AlunoDTO>();
		
		for(Aluno a : alunos) {
			
			AlunoDTO dto = new AlunoDTO();
			dto.setId(a.getId());
			dto.setNome(a.getNome());
			
			String[] endereco = a.getEndereco().split(",");
			
			if(endereco.length == 3) {
			 
				dto.setEndereco(endereco[0].trim());
				dto.setComplemento(endereco[1].trim());
				dto.setEstado(endereco[2].trim());
			
			} else {
				
				dto.setEndereco(endereco[0].trim());
				dto.setEstado(endereco[1].trim());
				
			}
			
			dtos.add(dto);
		}
		
		modelView.addObject("alunos", dtos);
		modelView.addObject("aluno", alunoDTO);
		
		return modelView;
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public ModelAndView salvar(@ModelAttribute("aluno") AlunoDTO alunoDTO) {
		
		if(alunoDTO.getNome() == null || alunoDTO.getNome().trim().isEmpty()) {
			
			throw new CampoObrigatorioException("O campo nome é de preenchimento obrigatório!");
			
		}
		
		if(alunoDTO.getEndereco() == null || alunoDTO.getEndereco().trim().isEmpty()) {
			
			throw new CampoObrigatorioException("O campo endereço é de preenchimento obrigatório!");
			
		}
		
		if(alunoDTO.getEstado() == null || alunoDTO.getEstado().trim().isEmpty()) {
			
			throw new CampoObrigatorioException("O campo estado é de preenchimento obrigatório!");
			
		}
		
		Aluno aluno = new Aluno();
		aluno.setId(alunoDTO.getId());
		aluno.setNome(alunoDTO.getNome());
		
		String e = String.format("%s, %s, %s", alunoDTO.getEndereco(), alunoDTO.getComplemento(), alunoDTO.getEstado());
		
		aluno.setEndereco(e);
		
		alunosService.salvar(aluno);
		
		ModelAndView modelView = new ModelAndView("alunos");
		
		List<Aluno> alunos = alunosService.listar();
		
		List<AlunoDTO> dtos = new ArrayList<AlunoDTO>();
		
		for(Aluno a : alunos) {
			
			AlunoDTO dto = new AlunoDTO();
			dto.setId(a.getId());
			dto.setNome(a.getNome());
			
			String[] endereco = a.getEndereco().split(",");
			
			if(endereco.length == 3) {
			 
				dto.setEndereco(endereco[0].trim());
				dto.setComplemento(endereco[1].trim());
				dto.setEstado(endereco[2].trim());
			
			} else {
				
				dto.setEndereco(endereco[0].trim());
				dto.setEstado(endereco[1].trim());
				
			}
			
			dtos.add(dto);
		}
		
		modelView.addObject("alunos", dtos);
		modelView.addObject("aluno", new AlunoDTO());
		
		return modelView;
		
	}

}