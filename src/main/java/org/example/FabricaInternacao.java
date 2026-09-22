package org.example;

public class FabricaInternacao implements FabricaAbstrata {
    @Override
    public Guia emitirGuia() {
        return new GuiaInternado();
    }

    @Override
    public Prontuario emitirProntuario() {
        return new ProntuarioInternado();
    }
}
