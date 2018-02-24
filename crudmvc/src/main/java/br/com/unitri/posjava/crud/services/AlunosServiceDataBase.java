package br.com.unitri.posjava.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unitri.posjava.crud.domain.Aluno;
import br.com.unitri.posjava.crud.repository.AlunosRepository;

@Service
public class AlunosServiceDataBase implements AlunosService {

	@Autowired
	private AlunosRepository repository;
	
	public List<Aluno> listar() {
		
		return repository.listar();
		
	}
	
	public void remover(Long id) {
		
		repository.remover(id);
		
	}
	
	public Aluno buscar(Long id) {
		
		return repository.buscar(id);
		
	}
	
	public void salvar(Aluno aluno) {
		
		if(aluno.getId() == null) {
			
			repository.salvar(aluno);
			
		} else {
			
			repository.atualizar(aluno);
			
		}
		
	}
	
}