package org.example.model;

import org.example.entity.Proposta;

public abstract class AbstractedRelatorio {
    protected Proposta[] propostas;

    public Proposta[] getPropostas() {
        return propostas;
    }

    public void setPropostas(Proposta[] propostas) {
        this.propostas = propostas;
    }

    public abstract Proposta[] gerar();
}
