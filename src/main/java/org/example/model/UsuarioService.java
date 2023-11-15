package org.example.model;

import org.example.ports.UsuarioPorta;

public class UsuarioService {

    private final UsuarioPorta usuarioPorta;

    public UsuarioService(UsuarioPorta usuarioPorta) {
        this.usuarioPorta = usuarioPorta;
    }

    public Proposta registrarProposta(Proposta proposta) {
        return usuarioPorta.registrarProposta(proposta);
    }
}
