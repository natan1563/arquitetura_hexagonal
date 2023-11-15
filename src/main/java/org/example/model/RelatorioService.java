package org.example.model;

import org.example.ports.RelatorioPorta;

public class RelatorioService {

    private final RelatorioPorta relatorioPorta;

    public RelatorioService(RelatorioPorta relatorioPorta) {
        this.relatorioPorta = relatorioPorta;
    }

    public Proposta[] gerar() {
        return relatorioPorta.gerar();
    }
}
