package br.com.unitri.posjava.testes;

public class TesteGenerics<T> {
	
	public T valor;

	public void setValor(T valor) {
		
		this.valor = valor;
		
	}
	
	public T getValor() {
		
		return valor;
		
	}
	
	public void imprime() {
		System.out.println(valor);
	}
	
}
