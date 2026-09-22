package org.example;

public class Paciente {
    private Guia guia;
    private Prontuario prontuario;

    public Paciente(FabricaAbstrata fabrica) {
        this.guia = fabrica.emitirGuia();
        this.prontuario = fabrica.emitirProntuario();
    }

    public String emitirProntuario() {
        return this.prontuario.exibir();
    }

    public String emitirGuia() {
        return this.guia.emitir();
    }
}
