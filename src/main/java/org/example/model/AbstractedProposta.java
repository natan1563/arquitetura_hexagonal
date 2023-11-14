package org.example.model;

import org.example.entity.Aprovador;
import org.example.entity.Notificacao;
import org.example.entity.Usuario;

import java.time.LocalDate;

public abstract class AbstractedProposta {
    protected String descricao;
    protected String documento;
    protected LocalDate dataCriacao;
    protected LocalDate dataAtualizacao;
    protected Boolean aprovada;
    protected Usuario registrador;
    protected Aprovador aprovador;

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

    public abstract Notificacao enviarNotificacao(); // Revisar na modelagem
}
