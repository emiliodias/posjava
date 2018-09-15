package br.com.unitri.soap;

import javax.jws.WebService;

@WebService
public interface HelloWorldSOAP {

	public String helloWorld(String nome);
	
}
