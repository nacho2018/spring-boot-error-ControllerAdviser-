package com.bolsadeideas.springboot.error.app.controllers;

import java.util.Date;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bolsadeideas.springboot.error.app.errors.UsuarioNoEncontradoException;

@ControllerAdvice
public class ErrorHandlerController {

	@ExceptionHandler(UsuarioNoEncontradoException.class)
	public ResponseEntity<Usuario> usuarioNoEncontrado(UsuarioNoEncontradoException ex, Model model) {
		return ResponseEntity.notFound().build();
	}
}
