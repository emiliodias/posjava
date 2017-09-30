package br.com.unitri.posjava.annotations.main;

import br.com.unitri.posjava.annotations.minhaapi.JDBCPersistenceAPI;
import br.com.unitri.posjava.annotations.minhaapi.PersistenceAPI;

public class Main {

	public static void main(String[] args) {
		
		PersistenceAPI api = new JDBCPersistenceAPI();
		
		Aluno a = new Aluno();
		a.setId(10);
		a.setNome("Aluno 3");
		
		api.salvar(a);
		
	}
	
}