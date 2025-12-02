import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiagnosticoTest {

    @Test
    public void diagnostico_aplicaDuracionMinimaDeCuatroDias() {
        Diagnostico diagnostico = new Diagnostico(
                "tos",
                "fiebre leve",
                "Gripe",
                2  
        );

        int duracion = diagnostico.duracionenfermedad();

        assertEquals(4, duracion,
                "Cuando la duración es 3 días o menos, debe guardarse como 4 días");
    }
}
