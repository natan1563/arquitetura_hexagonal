package org.example.application;

import org.example.adapters.AprovadorAdapter;
import org.example.adapters.RelatorioAdapter;
import org.example.adapters.SistemaAdapter;
import org.example.adapters.UsuarioAdapter;
import org.example.model.Notificacao;
import org.example.model.Proposta;
import org.example.model.Relatorio;
import org.example.ports.AprovadorPorta;
import org.example.ports.RelatorioPorta;
import org.example.ports.SistemaPorta;
import org.example.ports.UsuarioPorta;
import org.example.service.AprovadorService;
import org.example.service.RelatorioService;
import org.example.service.SistemaService;
import org.example.service.UsuarioService;

public class Main {

    public static void main(String[] args) {
        aprovandoProposta();

        gerandoRelatorios();

        sistemaGerandoNotificacoesRelatorioPropostas();

        usuarioRegistrandoPropostas();
    }

    private static void usuarioRegistrandoPropostas() {
        UsuarioPorta usuarioPorta = new UsuarioAdapter();
        UsuarioService usuarioService = new UsuarioService(usuarioPorta);
        Proposta proposta = new Proposta();
        usuarioService.registrarProposta(proposta);
    }

    private static void sistemaGerandoNotificacoesRelatorioPropostas() {
        SistemaPorta sistemaPorta = new SistemaAdapter();
        SistemaService sistemaService = new SistemaService(sistemaPorta);
        Notificacao notificacaoGerada = sistemaService.enviarNotificacao();
        Relatorio relatorioGerado = sistemaService.gerarRelatorios();
        Proposta propostaGerada = sistemaService.encaminharPropostas();
    }

    private static void gerandoRelatorios() {
        RelatorioPorta relatorioPorta = new RelatorioAdapter();
        RelatorioService relatorioService = new RelatorioService(relatorioPorta);
        Proposta[] propostas = relatorioService.gerar();
    }

    private static void aprovandoProposta() {
        AprovadorPorta aprovadorPorta = new AprovadorAdapter();
        AprovadorService aprovadorService = new AprovadorService(aprovadorPorta);
        Proposta proposta = new Proposta();
        aprovadorService.aprovar(proposta);
        aprovadorService.rejeitar(proposta);
    }

}