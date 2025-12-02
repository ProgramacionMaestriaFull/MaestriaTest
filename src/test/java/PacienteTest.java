import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PacienteTest {

        @Test
    void paciente_detalleIncluyeDiagnosticoYExamenes() {
        
        Paciente paciente = new Paciente("Ana", 30, "femenino");

        
        Diagnostico diag = new Diagnostico(
                "dolor de cabeza",
                "dolor moderado",
                "Migraña",
                5
        );

        
        TratamientoMedico tratamiento = new TratamientoMedico(
                "Dra. Pérez",
                3,
                "reposo relativo"
        );
        Medicamentos meds = new Medicamentos(true, 5, "Paracetamol");
        tratamiento.asignarMedicamentos(meds);

        
        ExamenesMedicos examenes = new ExamenesMedicos(
                true,   
                false,  
                false,  
                false   
        );
        examenes.asignartratamiento(tratamiento);

        
        diag.asignarExamenes(examenes);
        paciente.asignardiagnostico(diag);

        String detallePaciente = paciente.detallepaciente();

        
        assertTrue(detallePaciente.contains("Paciente: Ana"),
                "El detalle debe incluir el nombre del paciente");
        assertTrue(detallePaciente.contains("edad 30"),
                "El detalle debe incluir la edad del paciente");

       
        assertTrue(detallePaciente.contains("Enfermedad: Migraña"),
                "El detalle debe incluir la enfermedad del diagnóstico");

        
        assertTrue(detallePaciente.contains("Exámenes requeridos:"),
                "El detalle debe incluir la sección de exámenes");
        assertTrue(detallePaciente.contains("laboratorio"),
                "El detalle debe indicar que se requiere laboratorio");

        
        assertTrue(detallePaciente.contains("Tratamiento a seguir:"),
                "El detalle debe incluir el tratamiento a seguir");
        assertTrue(detallePaciente.contains("Medicamento: Paracetamol"),
                "El detalle debe incluir el medicamento asignado");
    }
}
