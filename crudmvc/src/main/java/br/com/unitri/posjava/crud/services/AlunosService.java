package br.com.unitri.posjava.crud.services;

import java.util.List;

import br.com.unitri.posjava.crud.domain.Aluno;

public interface AlunosService {

	List<Aluno> listar();

	void remover(Long id);

	Aluno buscar(Long id);

	void salvar(Aluno aluno);

}