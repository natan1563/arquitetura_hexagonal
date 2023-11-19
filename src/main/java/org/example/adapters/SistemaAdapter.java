package org.example.adapters;

import org.example.model.Notificacao;
import org.example.model.Proposta;
import org.example.model.Relatorio;
import org.example.ports.SistemaPorta;
import org.example.service.SistemaService;

public class SistemaAdapter implements SistemaPorta {

    private SistemaService sistemaService;

    @Override
    public Proposta encaminharPropostas() {
        return sistemaService.encaminharPropostas();
    }

    @Override
    public Relatorio gerarRelatorios() {
        return sistemaService.gerarRelatorios();
    }

    @Override
    public Notificacao enviarNotificacoes() {
        return sistemaService.enviarNotificacao();
    }

}
