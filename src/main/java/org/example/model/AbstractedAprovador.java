package org.example.model;

import org.example.entity.Proposta;

public abstract class AbstractedAprovador {
    protected String nome;
    protected String departamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public abstract Boolean aprovar(Proposta proposta);
    public abstract Boolean reprovar(Proposta proposta);
}
