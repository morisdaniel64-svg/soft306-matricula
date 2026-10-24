package soft306;

public class Matricula {
    public static String matricularEstudiante(
            int edad, int creditos, double promedio,
            boolean tieneMora) {
        if (edad < 17) {
            return "Matrícula rechazada";
        }
        if (creditos < 1 || creditos > 18) {
            return "Matrícula rechazada";
        }
        if (promedio < 70) {
            return "Matrícula rechazada";
        }
        if (tieneMora) {
            return "Matrícula rechazada";
        }
        return "Matrícula permitida";
    }

    public static String explicarResultado(
            int edad, int creditos, double promedio,
            boolean tieneMora) {
        if (edad < 17) {
            return "Matrícula rechazada: la edad mínima es 17 años.";
        }
        if (creditos < 1 || creditos > 18) {
            return "Matrícula rechazada: los créditos deben estar entre 1 y 18.";
        }
        if (promedio < 70) {
            return "Matrícula rechazada: el promedio mínimo es 70.";
        }
        if (tieneMora) {
            return "Matrícula rechazada: existe una mora pendiente.";
        }
        return "Matrícula permitida.";
    }
}