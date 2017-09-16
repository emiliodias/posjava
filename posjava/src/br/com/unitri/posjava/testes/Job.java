package br.com.unitri.posjava.testes;

public class Job implements Runnable{

	private Function callback;
	
	public Job(Function callback) {
		
		this.callback = callback;
		
	}

	@Override
	public void run() {
		
		System.out.println("Executando job...");
		
		this.callback.apply();
		
	}
	
}
