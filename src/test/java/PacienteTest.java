import org.example.FabricaAbstrata;
import org.example.FabricaAmbulatorial;
import org.example.FabricaInternacao;
import org.example.Paciente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacienteTest {
    @Test
    void deveEmitirGuiaAmbulatorial() {
        FabricaAbstrata fabrica = new FabricaAmbulatorial();
        Paciente paciente =  new Paciente(fabrica);
        assertEquals("Guia Ambulatorial", paciente.emitirGuia());
    }

    @Test
    void deveEmitirGuiaInternacao() {
        FabricaAbstrata fabrica = new FabricaInternacao();
        Paciente paciente =  new Paciente(fabrica);
        assertEquals("Guia Internação", paciente.emitirGuia());
    }

    @Test
    void deveEmitirProntuarioAmbulatorial() {
        FabricaAbstrata fabrica = new FabricaAmbulatorial();
        Paciente paciente =  new Paciente(fabrica);
        assertEquals("Exibir Prontuário Ambulatorial", paciente.emitirProntuario());
    }

    @Test
    void deveEmitirProntuarioInternacao() {
        FabricaAbstrata fabrica = new FabricaInternacao();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Exibir Prontuário Internado", paciente.emitirProntuario());
    }
}
