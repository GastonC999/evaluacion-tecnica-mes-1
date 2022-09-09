import javax.swing.*;

public class Evaluacion {
    public static void main(String[] args) {
        int a = 10, b = 2, suma = a + b;
        double c = 3.4, multiplicacion = c * b;


        ////////////////

/*        if (suma > 0) {
            JOptionPane.showMessageDialog(null, "resultado de suma: " + suma);
            JOptionPane.showMessageDialog(null, "resultado de multiplicacion: " + multiplicacion);
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }*/

        System.out.println("suma = " + suma);
        while (suma == 24){
            suma++;
        }
        JOptionPane.showMessageDialog(null, "El doble de 12 es " + suma);

        // c. Iteración --> Realizá N cantidad de impresiones, siendo N un tercio del valor de la variable del punto 'b'.

    }
}
