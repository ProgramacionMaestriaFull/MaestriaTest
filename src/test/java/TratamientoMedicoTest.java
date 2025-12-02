import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TratamientoMedicoTest {

    // Verifica que el tratamiento incluya profesional, horas y el detalle del medicamento
    @Test
    void tratamientoMedico_incluyeProfesionalHorasYMedicamento() {
        TratamientoMedico tratamiento = new TratamientoMedico(
                "Dr. House",
                2,
                "reposo absoluto"
        );

        Medicamentos meds = new Medicamentos(
                true,
                10,
                "Ibuprofeno"
        );

        tratamiento.asignarMedicamentos(meds);

        String detalle = tratamiento.detalleTratamiento();

        assertTrue(detalle.contains("Profesional: Dr. House"),
                "El detalle del tratamiento debe incluir el profesional de salud");
        assertTrue(detalle.contains("horas de dieta: 2"),
                "El detalle del tratamiento debe incluir las horas de dieta");
        assertTrue(detalle.contains("Medicamento: Ibuprofeno"),
                "El detalle del tratamiento debe incluir el detalle del medicamento");
    }
}
