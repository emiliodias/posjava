package br.com.unitri.posjava.app;

public class PedidosService {
	
	private PedidosDAO pedidosDAO;
	
	public PedidosService(PedidosDAO pedidosDAO) {
		
		this.pedidosDAO = pedidosDAO;
		
	}
	
	public void processaPedido(Pedido pedido) {
		
		if(pedido.getCliente() == null) {
			throw new ClienteNotNullException("Cliente não informado");
		}
		
		if(pedido.getProduto() == null) {
			throw new RuntimeException("Produto não informado");
		}
		
		pedidosDAO.salva(pedido);
		
	}

}
