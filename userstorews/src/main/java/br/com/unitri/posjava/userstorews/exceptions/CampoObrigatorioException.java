package br.com.unitri.posjava.userstorews.exceptions;

public class CampoObrigatorioException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -726392609966828871L;
	
	public CampoObrigatorioException(){}
	
	public CampoObrigatorioException(String msg) {
		
		super(msg);
		
	}
	
	public CampoObrigatorioException(String msg, Throwable e) {
		
		super(msg, e);
		
	}

}
