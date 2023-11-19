package org.example.model;

public class Sistema {
    private Proposta[] propostas;
    private Usuario[] usuarios;
    private Aprovador[] aprovadores;

    public Sistema(Proposta[] propostas, Usuario[] usuarios, Aprovador[] aprovadores) {
        this.propostas = propostas;
        this.usuarios = usuarios;
        this.aprovadores = aprovadores;
    }

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
}
