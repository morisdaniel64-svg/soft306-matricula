package soft306;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MatriculaTest {

    @Test
    void debePermitirMatriculaConDatosValidos() {
        assertEquals("Matrícula permitida",
                Matricula.matricularEstudiante(25, 12, 85.0, false));
    }

    @Test
    void debeRechazarEdadMenorDe17() {
        assertEquals("Matrícula rechazada",
                Matricula.matricularEstudiante(16, 12, 85.0, false));
    }

    @Test
    void debeRechazarCeroCreditos() {
        assertEquals("Matrícula rechazada",
                Matricula.matricularEstudiante(25, 0, 85.0, false));
    }

    @Test
    void debeRechazarMasDe18Creditos() {
        assertEquals("Matrícula rechazada",
                Matricula.matricularEstudiante(25, 19, 85.0, false));
    }

    @Test
    void debeRechazarPromedioMenorDe70() {
        assertEquals("Matrícula rechazada",
                Matricula.matricularEstudiante(25, 12, 69.99, false));
    }

    @Test
    void debeRechazarEstudianteConMora() {
        assertEquals("Matrícula rechazada",
                Matricula.matricularEstudiante(25, 12, 85.0, true));
    }

    // Pruebas de Valores Límite - Edad (Frontera: 17)
    @Test
    void edad16() {
        assertEquals("Matrícula rechazada", Matricula.matricularEstudiante(16, 12, 85, false));
    }

    @Test
    void edad17() {
        assertEquals("Matrícula permitida", Matricula.matricularEstudiante(17, 12, 85, false));
    }

    @Test
    void edad18() {
        assertEquals("Matrícula permitida", Matricula.matricularEstudiante(18, 12, 85, false));
    }

    // Pruebas de Valores Límite - Créditos (Fronteras: 1 y 18)
    @Test
    void creditos0() {
        assertEquals("Matrícula rechazada", Matricula.matricularEstudiante(25, 0, 85, false));
    }

    @Test
    void creditos1() {
        assertEquals("Matrícula permitida", Matricula.matricularEstudiante(25, 1, 85, false));
    }

    @Test
    void creditos18() {
        assertEquals("Matrícula permitida", Matricula.matricularEstudiante(25, 18, 85, false));
    }

    @Test
    void creditos19() {
        assertEquals("Matrícula rechazada", Matricula.matricularEstudiante(25, 19, 85, false));
    }

    // Pruebas de Valores Límite - Promedio (Frontera: 70)
    @Test
    void promedio6999() {
        assertEquals("Matrícula rechazada", Matricula.matricularEstudiante(25, 12, 69.99, false));
    }

    @Test
    void promedio70() {
        assertEquals("Matrícula permitida", Matricula.matricularEstudiante(25, 12, 70, false));
    }

    @Test
    void promedio7001() {
        assertEquals("Matrícula permitida", Matricula.matricularEstudiante(25, 12, 70.01, false));
    }
}