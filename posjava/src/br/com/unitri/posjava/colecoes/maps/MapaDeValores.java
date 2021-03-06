package br.com.unitri.posjava.colecoes.maps;

public class MapaDeValores {

	public static void main(String[] args) {
		
		RepositorioDeDados dados = new RepositorioDeDados();
		
		Cliente c1 = new Cliente();
		c1.setId(1l);
		c1.setNome("Zezin");
		c1.setTipo("FISICA");
		
		Cliente c2 = new Cliente();
		c2.setId(2l);
		c2.setNome("Maria");
		c2.setTipo("FISICA");
		
		dados.salvar(c1);
		dados.salvar(c2);
		
		Cliente busca = new Cliente();
		busca.setId(1l);
		busca.setTipo("JURIDICA");
		
		busca = dados.buscar(busca);
		
		if(busca == null) {
			System.out.println("Cliente não encontrado.");
		} else {
		
			System.out.println("Nome: " + busca.getNome());
			System.out.println("ID: " + busca.getId());
			System.out.println("Tipo: " + busca.getTipo());
		
		}
		
		dados.imprimeClientes();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
	}
	
}
