package br.com.unitri.soap;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.unitri.soap.HelloWorldSOAP")
public class HelloWorldImpl implements HelloWorldSOAP {

	public String helloWorld(String nome) {
		
		return "Hello world " + nome;
		
	}

}
