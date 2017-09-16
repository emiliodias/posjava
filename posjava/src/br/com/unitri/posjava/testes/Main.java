package br.com.unitri.posjava.testes;

public class Main {

	public static void main(String[] args) {

		/*
		 * Function callback = ()-> System.out.println("Callback invocado.");
		 * 
		 * Job job = new Job(callback);
		 * 
		 * new Thread(job, "Nome-da-Thread").start();
		 * 
		 * System.out.println("Testando...");
		 */

		imprime(9, (Integer valor) -> {
			if (valor % 2 == 0)
				return true;
			return false;
		});

	}

	public static void imprime(Integer valor, FunctionBoolean funcao) {

		boolean response = funcao.apply(valor);

		if (response) {
			System.out.println(valor);
		} else {
			System.out.println("Valor inválido!");
		}

	}

}
