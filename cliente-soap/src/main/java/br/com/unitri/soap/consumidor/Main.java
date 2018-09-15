package br.com.unitri.soap.consumidor;

import br.com.unitri.soap.HelloWorldImplService;
import br.com.unitri.soap.HelloWorldSOAP;

public class Main {
	
	public static void main(String[] args) {
		
		HelloWorldSOAP servico = new HelloWorldImplService().getHelloWorldImplPort();
		
		String resposta = servico.helloWorld( "Chupa Argentina!!!" );
		
		System.out.println(resposta);
		
	}

}
