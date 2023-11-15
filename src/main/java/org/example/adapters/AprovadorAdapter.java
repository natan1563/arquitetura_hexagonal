package org.example.adapters;

import org.example.model.Proposta;
import org.example.ports.AprovadorPorta;

public class AprovadorAdapter implements AprovadorPorta {

    @Override
    public Boolean aprovar(Proposta proposta) {
        return null;
    }

    @Override
    public Boolean rejeitar(Proposta proposta) {
        return null;
    }

}
