package org.example.service;

import org.example.model.Notificacao;
import org.example.model.Proposta;
import org.example.model.Relatorio;
import org.example.ports.SistemaPorta;

public class SistemaService {

    private final SistemaPorta sistemaPorta;

    public SistemaService(SistemaPorta sistemaPorta) {
        this.sistemaPorta = sistemaPorta;
    }

    public Notificacao enviarNotificacao() {
        return sistemaPorta.enviarNotificacoes();
    }

    public Relatorio gerarRelatorios() {
        return sistemaPorta.gerarRelatorios();
    }

    public Proposta encaminharPropostas() {
        return sistemaPorta.encaminharPropostas();
    }
}
