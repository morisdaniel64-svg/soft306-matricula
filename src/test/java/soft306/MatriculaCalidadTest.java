package soft306;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MatriculaCalidadTest {
    @Test
    void explicaEdadInsuficiente() {
        assertEquals(
                "Matrícula rechazada: la edad mínima es 17 años.",
                Matricula.explicarResultado(16, 12, 85.0, false)
        );
    }
    @Test
    void explicaCreditosFueraDeRango() {
        assertEquals(
                "Matrícula rechazada: los créditos deben estar entre 1 y 18.",
                Matricula.explicarResultado(25, 19, 85.0, false)
        );
    }
    @Test
    void explicaPromedioInsuficiente() {
        assertEquals(
                "Matrícula rechazada: el promedio mínimo es 70.",
                Matricula.explicarResultado(25, 12, 69.99, false)
        );
    }
    @Test
    void explicaMora() {
        assertEquals(
                "Matrícula rechazada: existe una mora pendiente.",
                Matricula.explicarResultado(25, 12, 85.0, true)
        );
    }
    @Test
    void permiteCuandoTodasLasReglasSeCumplen() {
        assertEquals(
                "Matrícula permitida.",
                Matricula.explicarResultado(25, 12, 85.0, false)
        );
    }
    @Test
    void limitePromedio70SigueValido() {
        assertEquals(
                "Matrícula permitida.",
                Matricula.explicarResultado(25, 12, 70.0, false)
        );
    }
}