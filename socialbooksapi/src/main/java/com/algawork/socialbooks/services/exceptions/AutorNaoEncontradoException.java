package com.algawork.socialbooks.services.exceptions;

public class AutorNaoEncontradoException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3121326619542792049L;

	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
	
}
