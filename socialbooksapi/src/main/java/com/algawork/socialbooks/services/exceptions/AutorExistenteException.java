package com.algawork.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3121326619542792049L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
	
}
