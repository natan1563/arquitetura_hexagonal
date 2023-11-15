package org.example.model;

public class Sistema {
    protected Proposta[] propostas;
    protected Usuario[] usuarios;
    protected AprovadorService[] aprovadores;

    public Sistema(Proposta[] propostas, Usuario[] usuarios, AprovadorService[] aprovadores) {
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

    public AprovadorService[] getAprovadores() {
        return aprovadores;
    }

    public void setAprovadores(AprovadorService[] aprovadores) {
        this.aprovadores = aprovadores;
    }
}
