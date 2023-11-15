package org.example.model;

import org.example.ports.SistemaPorta;

public class SistemaService {

    private final SistemaPorta sistemaPorta;

    public SistemaService(SistemaPorta sistemaPorta) {
        this.sistemaPorta = sistemaPorta;
    }

    public Proposta enviarNotificacao() {
        return sistemaPorta.enviarNotificacoes();
    }

    public Relatorio gerarRelatorios() {
        return sistemaPorta.gerarRelatorios();
    }

    public Proposta encaminharPropostas() {
        return sistemaPorta.encaminharPropostas();
    }
}
