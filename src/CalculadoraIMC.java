import java.util.Scanner;

public class CalculadoraIMC {

    // Constantes
    final static Float PESO_BAJO = 18.5f;
    final static Float PESO_NORMAL = 24.9f;
    final static Float SOBREPESO = 24.9f;
    final static Float OBESIDAD = 30.0f;
    final static Scanner teclado = new Scanner(System.in);


    // Esta funcion sirve para realizar el calculo de la indice de masa corporal
    private static float calcularIMC(float peso, float estatura) {
        return (float) (peso / (estatura * estatura));
    }

    private static String determinarCategoria(float imc) {
        int opcion = (imc < PESO_BAJO) ? 1 : (imc <= PESO_NORMAL) ? 2 : (imc <= SOBREPESO) ? 3 : (imc < OBESIDAD) ? 4: 5;

        switch (opcion) {
            case 1:
                return "Bajo peso";
            case 2:
                return "Peso Normal";
            case 3:
                return "Sobrepeso";
            case 4:
                return "Obesidad";
            default:
                return "Error en el calculo";
        }
    }

    public static void main(String[] args) {
        System.out.println("CALCULADORA DE IMC");
        System.out.println("-------------------");

        // Solicitar datos al usuario
        System.out.print("Ingrese su peso en kilogramos: ");
        float peso = teclado.nextFloat();

        System.out.print("Ingrese su estatura en metros: ");
        float estatura = teclado.nextFloat();

        // Calcular IMC
        float imc = calcularIMC(peso, estatura);
        String categoria = determinarCategoria(imc);

        //mostrar los resultados
        System.out.printf("""
                        ------------------------
                        |    CALCULAOORA IMC    |
                        ------------------------
                            Peso: %.2f
                            Altura: %.2f
                        ------------------------
                           SU IMC es: %.2f%n
                           Categoria: %s
                        """
                , peso, estatura, imc, categoria);

        teclado.close();

    }
}
