package br.com.unitri.posjava.threads;

public class Conta {
	
	private long saldo = 0l;
	
	public Conta(Long saldo) {
		
		this.saldo = saldo;
		
	}
	
	public void saca(long valor) {
		
		if(saldo - valor >=0) {
			
			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			saldo = saldo - valor;
		}
		
		System.out.println("Saldo atual: " + saldo);
		
	}

	public long getSaldo() {
		return saldo;
	}

}
