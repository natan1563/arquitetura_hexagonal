package org.example.service;

import org.example.model.Proposta;
import org.example.ports.AprovadorPorta;

public class AprovadorService{

    private final AprovadorPorta aprovadorPorta;

    public AprovadorService(AprovadorPorta aprovadorPorta) {
        this.aprovadorPorta = aprovadorPorta;
    }

    public Boolean aprovar(Proposta proposta) {
        return aprovadorPorta.aprovar(proposta);
    }

    public Boolean rejeitar(Proposta proposta) {
        return aprovadorPorta.rejeitar(proposta);
    }
}
