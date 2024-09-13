package br.net.william.crud.rest;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import br.net.william.crud.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin
@RestController
public class UsuarioREST {
    public static List<Usuario> lista = new ArrayList<Usuario>();

    @GetMapping("/usuarios")
    public List<Usuario> obterTodosUsuarios() {
        return lista;
    }

    static {
        lista.add(
            new Usuario(1, "administr", "admin", "admin", "ADMIN"));
        lista.add(
            new Usuario(2, "gerent", "gerente", "gerente", "GERENTE"));            
        lista.add(
            new Usuario(3, "funcion", "func", "func", "FUNC"));            
    }
}
