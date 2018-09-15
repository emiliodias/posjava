package br.com.unitri.posjava.ws;
import javax.jws.WebService;

import br.com.unitri.posjava.model.Cliente;
 
@WebService
public interface ClienteWS {
	
    public Cliente getCliente(Long id);
    
    public void salvar(Cliente cliente);
    
}