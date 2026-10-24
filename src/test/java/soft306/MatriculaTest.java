package soft306;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MatriculaTest {
    @Test
    void permiteMatriculaConDatosValidos() {
        assertEquals(
                "Matrícula permitida",
                Matricula.matricularEstudiante(25, 12, 85.0, false)
        );
    }
    @Test
    void rechazaEdadInsuficiente() {
        assertEquals(
                "Matrícula rechazada",
                Matricula.matricularEstudiante(16, 12, 85.0, false)
        );
    }
}