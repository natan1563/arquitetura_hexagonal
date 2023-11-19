package org.example.model;

import java.time.LocalDate;

public class Proposta {
    private String descricao;
    private String documento;
    private LocalDate dataCriacao;
    private LocalDate dataAtualizacao;
    private Boolean aprovada;
    private Usuario registrador;
    private Aprovador aprovador;

    public Proposta(String descricao, String documento, LocalDate dataCriacao, LocalDate dataAtualizacao, Boolean aprovada, Usuario registrador, Aprovador aprovador) {
        this.descricao = descricao;
        this.documento = documento;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
        this.aprovada = aprovada;
        this.registrador = registrador;
        this.aprovador = aprovador;
    }

    public Proposta() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Usuario getRegistrador() {
        return registrador;
    }

    public void setRegistrador(Usuario registrador) {
        this.registrador = registrador;
    }

    public Aprovador getAprovador() {
        return aprovador;
    }

    public void setAprovador(Aprovador aprovador) {
        this.aprovador = aprovador;
    }
}
