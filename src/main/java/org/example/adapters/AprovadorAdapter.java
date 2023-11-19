package org.example.adapters;

import org.example.model.Proposta;
import org.example.ports.AprovadorPorta;
import org.example.service.AprovadorService;

public class AprovadorAdapter implements AprovadorPorta {

    private AprovadorService aprovadorService;

    @Override
    public Boolean aprovar(Proposta proposta) {
        return aprovadorService.aprovar(proposta);
    }

    @Override
    public Boolean rejeitar(Proposta proposta) {
        return aprovadorService.rejeitar(proposta);
    }

}
