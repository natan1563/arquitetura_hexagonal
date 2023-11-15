package org.example.ports;

import org.example.model.Proposta;

public interface AprovadorPorta {
    Boolean aprovar(Proposta proposta);
    Boolean rejeitar(Proposta proposta);
}
