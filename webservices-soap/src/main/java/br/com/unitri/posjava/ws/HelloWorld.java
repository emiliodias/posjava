package br.com.unitri.posjava.ws;
import javax.jws.WebService;
 
@WebService
public interface HelloWorld {
	
    String hello(String name);
    
}