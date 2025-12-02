import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedicamentosTest {

    
    @Test
    void medicamentos_noRequeridos_devuelvenMensajePorDefecto() {
        Medicamentos meds = new Medicamentos(
                false,      // no requiere medicamentos
                0,          // cantidad inválida
                ""          // nombre vacío
        );

        String detalle = meds.detallemedicamento();

        assertEquals("El paciente no requiere medicamentos.", detalle,
                "Si no se requieren medicamentos o la cantidad es inválida, debe mostrar el mensaje por defecto");
    }
}
