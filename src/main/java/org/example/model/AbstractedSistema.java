package org.example.model;

import org.example.entity.Aprovador;
import org.example.entity.Proposta;
import org.example.entity.Usuario;

public abstract class AbstractedSistema {
    protected Proposta[] propostas;
    protected Usuario[] usuarios;
    protected Aprovador[] aprovadores;

    public Proposta[] getPropostas() {
        return propostas;
    }

    public void setPropostas(Proposta[] propostas) {
        this.propostas = propostas;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public Aprovador[] getAprovadores() {
        return aprovadores;
    }

    public void setAprovadores(Aprovador[] aprovadores) {
        this.aprovadores = aprovadores;
    }

    public AbstractedSistema(Proposta[] propostas, Usuario[] usuarios, Aprovador[] aprovadores) {
        this.propostas = propostas;
        this.usuarios = usuarios;
        this.aprovadores = aprovadores;
    }

    public abstract Proposta encaminharPropostas();
    public abstract Proposta enviarNotificacoes();
    public abstract Proposta gerarRelatorios();
}
