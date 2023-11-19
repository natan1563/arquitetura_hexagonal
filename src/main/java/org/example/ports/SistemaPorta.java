package org.example.ports;

import org.example.model.Notificacao;
import org.example.model.Proposta;
import org.example.model.Relatorio;

public interface SistemaPorta {
    Proposta encaminharPropostas();
    Relatorio gerarRelatorios();
    Notificacao enviarNotificacoes();
}
