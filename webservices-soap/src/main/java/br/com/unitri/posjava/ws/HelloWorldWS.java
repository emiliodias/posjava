package br.com.unitri.posjava.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.unitri.posjava.ws.HelloWorld")
public class HelloWorldWS implements HelloWorld {

	public String hello(String name) {
		
		return "Hello " + name;
		
	}

}