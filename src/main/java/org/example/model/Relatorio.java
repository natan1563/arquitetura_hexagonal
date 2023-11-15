package org.example.model;

public class Relatorio {
    private Proposta[] propostas;

    public Relatorio(Proposta[] propostas) {
        this.propostas = propostas;
    }

    public Proposta[] getPropostas() {
        return propostas;
    }

    public void setPropostas(Proposta[] propostas) {
        this.propostas = propostas;
    }
}
