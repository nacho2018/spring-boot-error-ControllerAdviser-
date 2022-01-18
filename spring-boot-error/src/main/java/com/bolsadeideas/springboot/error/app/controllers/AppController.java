package com.bolsadeideas.springboot.error.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bolsadeideas.springboot.error.app.errors.UsuarioNoEncontradoException;
import com.bolsadeideas.springboot.error.app.models.domain.Usuario;
import com.bolsadeideas.springboot.error.app.services.UsuarioService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AppController {

	private UsuarioService usuarioService;

	@Autowired
	public void setUsuarioService(UsuarioService usuarioService){
		this.usuarioService = usuarioService;
	}

	@GetMapping("/user/getUser/{id}")
	public ResponseEntity<Usuario> getUsuario(@PathVariable("id")  Long id) throws Exception{
		Optional<Usuario> optUser = this.usuarioService.getUsuario(id);
		return ResponseEntity.ok(optUser.get());
	}



}
