package br.com.unitri.posjava.app;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		PedidosDAO dao = new PedidosDAO();
		
		PedidosService service = new PedidosService(dao);
		
		Cliente cliente = new Cliente();
		cliente.setCpf("111.111.111-11");
		cliente.setId(1l);
		cliente.setNome("José");
		
		Produto p1 = new Produto();
		p1.setDescricao("Muito bom...");
		p1.setId(1l);
		p1.setNome("TV 50 polegadas");
		
		Pedido pedido = new Pedido();
		//pedido.setCliente(cliente);
		pedido.setData(new Date());
		pedido.setProduto(p1);
		pedido.setId(1l);
		
		try {
		
			service.processaPedido(pedido);
			service.processaPedido(pedido);
			
		} catch (PedidoJaExistenteException e) {
			
			System.out.println("Meu amigo cliente, pelo amor de Deus, coloca os dados direito.");
			
		} catch (ClienteNotNullException e) {
			
			System.out.println("Meu amigo cliente, pelo amor de Deus, informa o cliente que está comprando.");
		}
		
		
	}
	
}