package org.example.model;

import org.example.entity.Aprovador;
import org.example.entity.Notificacao;
import org.example.entity.Proposta;
import org.example.entity.Usuario;

import java.time.LocalDate;

public abstract class AbstractedUsuario {
    protected String nome;
    protected String sobrenome;
    protected String email;
    protected String senha;
    protected String nivelAcesso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public abstract Proposta registrarProposta(Proposta proposta);
}
