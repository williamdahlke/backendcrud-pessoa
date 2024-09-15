package br.net.william.crud.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.william.crud.model.Usuario;

@CrossOrigin
@RestController
public class UsuarioREST {
    public static List<Usuario> usuarios = new ArrayList<>();

    @GetMapping("/usuarios")
    public List<Usuario> obterTodosUsuarios() {
        return usuarios;
    }

    static {
        usuarios.add(
            new Usuario(1, "administr", "admin", "admin", "ADMIN"));
        usuarios.add(
            new Usuario(2, "gerent", "gerente", "gerente", "GERENTE"));            
        usuarios.add(
            new Usuario(3, "funcion", "func", "func", "FUNC"));            
    }
}
