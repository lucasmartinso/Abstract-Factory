package org.example;

public class FabricaAmbulatorial implements FabricaAbstrata {
    @Override
    public Guia emitirGuia() { return new GuiaAmbulatorial(); }

    @Override
    public Prontuario emitirProntuario() { return new ProntuarioAmbulatorial(); }
}
