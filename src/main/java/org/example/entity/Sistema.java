package org.example.entity;

import org.example.model.AbstractedSistema;

public class Sistema extends AbstractedSistema {
    public Sistema(Proposta[] propostas, Usuario[] usuarios, Aprovador[] aprovadores) {
        super(propostas, usuarios, aprovadores);
    }

    @Override
    public Proposta encaminharPropostas() {
        return null;
    }

    @Override
    public Proposta enviarNotificacoes() {
        return null;
    }

    @Override
    public Proposta gerarRelatorios() {
        return null;
    }
}
