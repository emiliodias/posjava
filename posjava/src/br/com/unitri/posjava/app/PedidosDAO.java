package br.com.unitri.posjava.app;

import java.util.HashMap;
import java.util.Map;

public class PedidosDAO {
	
	private Map<Long, Pedido> pedidos = new HashMap<Long, Pedido>();
	
	public void salva(Pedido pedido) {
		
		if(pedido.getId() != null && pedidos.get(pedido.getId()) != null) {
			throw new PedidoJaExistenteException("Já existe um pedido com este identificador.");
		}
		
		if(pedido.getId() == null) {
			
			pedido.setId(System.currentTimeMillis());
			
		}
		
		pedidos.put(pedido.getId(), pedido);
		
	}
	
	public Pedido buscaPedido(Long id) {
		
		return pedidos.get(id);
		
	}
	
	public void removePedido(Long id) {
		
		pedidos.remove(id);
		
	}
 
}
