package org.example.adapters;

import org.example.model.Proposta;
import org.example.ports.RelatorioPorta;
import org.example.service.RelatorioService;

public class RelatorioAdapter implements RelatorioPorta {

    private final RelatorioService relatorioService;

    public RelatorioAdapter(RelatorioService relatorioService) {
        this.relatorioService = relatorioService;
    }

    @Override
    public Proposta[] gerar() {
        return relatorioService.gerar();
    }

}
