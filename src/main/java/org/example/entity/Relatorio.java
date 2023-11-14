package org.example.entity;

import org.example.model.AbstractedRelatorio;

public class Relatorio extends AbstractedRelatorio {
    @Override
    public Proposta[] gerar() {
        return new Proposta[0];
    }
}
