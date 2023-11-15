package org.example.adapters;

import org.example.model.Proposta;
import org.example.ports.RelatorioPorta;

public class RelatorioAdapter implements RelatorioPorta {

    @Override
    public Proposta[] gerar() {
        return new Proposta[0];
    }

}
