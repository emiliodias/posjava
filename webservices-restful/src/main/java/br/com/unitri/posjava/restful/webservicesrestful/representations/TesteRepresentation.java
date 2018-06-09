package br.com.unitri.posjava.restful.webservicesrestful.representations;

public class TesteRepresentation {
	
	private String name;
	
	public TesteRepresentation() {}
	
	public TesteRepresentation(String name) {
		
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TesteRepresentation [name=" + name + "]";
	}

}