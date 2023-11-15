package org.example.model;

import java.time.LocalDate;

public class Notificacao {

    private String mensagem;
    private LocalDate timestamp;

    public Notificacao(String mensagem, LocalDate timestamp) {
        this.mensagem = mensagem;
        this.timestamp = timestamp;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }
}
