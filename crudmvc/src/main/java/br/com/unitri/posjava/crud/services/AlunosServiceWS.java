package br.com.unitri.posjava.crud.services;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.unitri.posjava.crud.domain.Aluno;

@Service
public class AlunosServiceWS implements AlunosService {
	
	private final String URL = "http://localhost:8080/crudws/alunos/";

	public List<Aluno> listar() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<Aluno>> response =
		        restTemplate.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Aluno>>() {
		            });
		List<Aluno> alunos = response.getBody();
		
		return alunos;
		
	}
	
	public void remover(Long id) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		restTemplate.delete(URL + id);
		
	}
	
	public Aluno buscar(Long id) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Aluno> response =
		        restTemplate.exchange(URL + id,
		                    HttpMethod.GET, null, new ParameterizedTypeReference<Aluno>() {
		            });
		Aluno aluno = response.getBody();
		
		return aluno;
		
	}
	
	public void salvar(Aluno aluno) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		restTemplate.postForEntity(URL , aluno, Aluno.class);
		
	}
	
}