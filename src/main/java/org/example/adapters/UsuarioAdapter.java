package org.example.adapters;

import org.example.model.Proposta;
import org.example.ports.UsuarioPorta;
import org.example.service.UsuarioService;

public class UsuarioAdapter implements UsuarioPorta {

    private UsuarioService usuarioService;

    @Override
    public Proposta registrarProposta(Proposta proposta) {
        return usuarioService.registrarProposta(proposta);
    }

}
