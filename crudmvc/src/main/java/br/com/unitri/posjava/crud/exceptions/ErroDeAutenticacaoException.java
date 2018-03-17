package br.com.unitri.posjava.crud.exceptions;

public class ErroDeAutenticacaoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -726392609966828871L;
	
	public ErroDeAutenticacaoException(){}
	
	public ErroDeAutenticacaoException(String msg) {
		
		super(msg);
		
	}
	
	public ErroDeAutenticacaoException(String msg, Throwable e) {
		
		super(msg, e);
		
	}

}
