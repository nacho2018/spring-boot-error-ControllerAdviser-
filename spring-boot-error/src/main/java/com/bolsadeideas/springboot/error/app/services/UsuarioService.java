package com.bolsadeideas.springboot.error.app.services;


import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

import java.util.Optional;

public interface UsuarioService {
	
    Usuario createUser(Usuario usuario);
    Optional<Usuario> getUsuario(long id) throws Exception;

}
