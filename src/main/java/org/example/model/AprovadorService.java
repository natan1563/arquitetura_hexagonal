package org.example.model;

import org.example.ports.AprovadorPorta;

public class AprovadorService{

    private final AprovadorPorta aprovadorPorta;

    public AprovadorService(AprovadorPorta aprovadorPorta) {
        this.aprovadorPorta = aprovadorPorta;
    }

    public void aprovar(Proposta proposta) {
        aprovadorPorta.aprovar(proposta);
    }

    public void rejeitar(Proposta proposta) {
        aprovadorPorta.rejeitar(proposta);
    }
}
