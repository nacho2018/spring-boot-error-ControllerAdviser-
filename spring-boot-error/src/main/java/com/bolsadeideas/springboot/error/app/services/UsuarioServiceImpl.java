package com.bolsadeideas.springboot.error.app.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.bolsadeideas.springboot.error.app.errors.UsuarioNoEncontradoException;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private List<Usuario> usuarios;

    {
        usuarios = new ArrayList<>();
        usuarios.add(
                new Usuario(4958394, "Peter Johnson", "New York", Arrays.asList("swimming", "cusine","sports")));
        usuarios.add(
                new Usuario(5938493, "Sammuel Fries", "Oregon", Arrays.asList("reading", "sports","pets")));
    }

    @Override
    public Usuario createUser(Usuario usuario) {
        usuarios.add(usuario);
        return  usuario;
    }

    @Override
    public Optional<Usuario> getUsuario(long id) throws Exception{
       Usuario result = null;
       Predicate<Usuario> pr = user -> user.getId() == id;

       for(Usuario user : usuarios){
           if(pr.test(user)){
               result = new Usuario(user.getId(), user.getName(), user.getCity(), user.getHobbies());
               break;
           }
       }
       Optional<Usuario> opt = Optional.ofNullable(result);
       if (opt.isEmpty())
           throw new UsuarioNoEncontradoException();

       return opt;

    }

}
