package soft306;

public class Matricula {

    public static String matricularEstudiante(int edad, int creditos, double promedio, boolean tieneMora) {

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
}