package br.com.iamjose.globalexceptionhandling.controllers;

import br.com.iamjose.globalexceptionhandling.domain.Usuario;
import br.com.iamjose.globalexceptionhandling.domain.exception.UsuarioNaoEncontradoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @GetMapping
    public ResponseEntity procurarUsuario(@RequestParam("usuario") String usuario) {
        return ResponseEntity.status(200).body(procurarUsuarioPeloNome(usuario));
    }

    public List<Usuario> inicializarLista() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("José", 1.78));
        listaUsuarios.add(new Usuario("Paulo", 1.79));
        return listaUsuarios;
    }

    public Usuario procurarUsuarioPeloNome(String nomeUsuario) {
        var listaUsuarios = this.inicializarLista();
        for (Usuario usuario : listaUsuarios) {
            if (nomeUsuario.equals(usuario.getUsuario()))
                return usuario;
        }

        throw new UsuarioNaoEncontradoException(nomeUsuario);
    }

}
