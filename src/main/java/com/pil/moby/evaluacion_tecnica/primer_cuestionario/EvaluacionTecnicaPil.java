import javax.swing.*;

public class EvaluacionTecnicaPil {

    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        /****
         * TEMAS:
         *   - Tipos de datos.
         *   - Flujos de control.
         *   - Operadores.
         *   - Clases System.
         ****/

        /****
         * CONSIGNAS:
         * 1. Declará al menos tres variables con tipos de datos primitivos.
         * 2. A las variables declaradas anteriormente asignales un valor
         *    y realizá al menos dos cálculos matemáticos utilizando -operadores aritméticos-.
         * 3. Planteá tres condiciones lógicas que cumplan con lo siguiente:
         *      a. Condición verdadera --> Imprimí por pantalla el resultado de los cálculos anteriores.
         *         Condición falsa --> Imprimí por pantalla un mensaje de error.
         *      b. Condición verdadera --> Siempre que se cumpla, incrementá un valor hasta que éste llegue al doble de su valor inicial.
         *                                 Antes de realizar esta condición, imprimí el valor inicial de la variable que vas a modificar.
         *                                 Finalmente, imprimí por pantalla el valor final.
         *      c. Iteración --> Realizá N cantidad de impresiones, siendo N un tercio del valor de la variable del punto 'b'.
         ****/

        imprimirConsigna(1);

        int a = 10, b = 2, suma = a + b;
        double c = 3.4, multiplicacion = c * b;


        if (suma > 0) {
            JOptionPane.showMessageDialog(null, "resultado de suma: " + suma);
            JOptionPane.showMessageDialog(null, "resultado de multiplicacion: " + multiplicacion);
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }

        imprimirConsigna(2);

        System.out.println("suma = " + suma);
        while (suma == 24){
            suma++;
        }
        JOptionPane.showMessageDialog(null, "El doble de 12 es " + suma);


        imprimirConsigna(3);

        // Desarrollo de la consigna 3.

    }

    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("*******************************************");
        System.out.println("Bienvenidos a la primer Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    private static void imprimirConsigna(int numeroConsigna) {
        System.out.println("**********");
        System.out.println("CONSIGNA " + numeroConsigna);
        System.out.println("**********\n");
    }
}
