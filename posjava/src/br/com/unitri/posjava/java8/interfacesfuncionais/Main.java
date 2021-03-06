package br.com.unitri.posjava.java8.interfacesfuncionais;

public class Main {

	public static void main(String[] args) {

		// Utilizando a criação de uma classe MinhaRegra...

		Regra<Usuario> regra1 = new MinhaRegra();

		// Criando uma classe anonima...

		Regra<Usuario> regra2 = new Regra<Usuario>() {

			@Override
			public boolean valida(Usuario usuario) {

				if (usuario.getPontos() > 10)
					return true;

				return false;
			}

		};

		// Inteface funcional:

		Regra<Usuario> regraComLambda = (Usuario u) -> {
			
			if (u.getPontos() > 10)
				return true;

			return false;
		};
		
		//Exemplo com Strings...
		
		Validador<String> validaCEPClasseAnonima = new Validador<String>() {

			@Override
			public boolean valida(String t) {
				return t.matches("[0-9]{5}-[0-9]{3}");
			}
			
		};
		
		
		Validador<String> validaCEPIntefaceFuncional = (String cep) -> {return cep.matches("[0-9]{5}-[0-9]{3}");};
		
		//Deixando ainda mais resumido...
		
		Validador<String> validaCEPIntefaceFuncional2 = cep -> cep.matches("[0-9]{5}-[0-9]{3}");
		

	}

}
