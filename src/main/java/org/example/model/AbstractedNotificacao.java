package org.example.model;

import java.time.LocalDate;

public abstract class AbstractedNotificacao {
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

    protected String mensagem;
    protected LocalDate timestamp;
}
