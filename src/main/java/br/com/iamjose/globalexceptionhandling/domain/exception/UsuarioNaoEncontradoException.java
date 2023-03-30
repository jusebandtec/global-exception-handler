package br.com.iamjose.globalexceptionhandling.domain.exception;

import br.com.iamjose.globalexceptionhandling.framework.globalExceptionHandling.NotFoundException;

public class UsuarioNaoEncontradoException extends NotFoundException {
    public UsuarioNaoEncontradoException(String usuario) {
        super("001", String.format("Usuário %s não encontrado", usuario));
    }
}
