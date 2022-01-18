package com.bolsadeideas.springboot.error.app.errors;

public class UsuarioNoEncontradoException extends RuntimeException {


	public UsuarioNoEncontradoException() {
		super("Usuario  no existe en el sistema");
	}

	private static final long serialVersionUID = 1L;

}
