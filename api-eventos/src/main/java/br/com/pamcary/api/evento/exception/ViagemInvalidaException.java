package br.com.pamcary.api.evento.exception;

public class ViagemInvalidaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ViagemInvalidaException(String message) {
		super(message);
	}

	public ViagemInvalidaException(String message, Throwable cause) {
		super(message, cause);
	}

}