package br.com.unitri.posjava.threads;

public class Paralelo {
	
	public static void main(String[] args) {
		
		Impressora impressora = new Impressora();
		
		Runnable tarefa1 = new Runnable() {
			
			@Override
			public void run() {
				impressora.imprime(0, 100);
				
			}
		};

		Runnable tarefa2 = new Runnable() {
			
			@Override
			public void run() {
				impressora.imprime(101, 200);
				
			}
		};
		
		Runnable tarefa3 = new Runnable() {
			
			@Override
			public void run() {
				impressora.imprime(201, 300);
				
			}
		};
		
		new Thread(tarefa1).start();
		new Thread(tarefa2).start();
		new Thread(tarefa3).start();
		
		
		
	}

}
