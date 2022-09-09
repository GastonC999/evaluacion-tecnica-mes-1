import javax.swing.*;

public class Evaluacion {
    public static void main(String[] args) {
        int a = 12, b = 2,   resta= a - b;
        double c = 3.4,      multiplicacion= c * b;



        ////////////////

        if (resta >0){
            JOptionPane.showMessageDialog(null,"resultado de resta: " + resta);
            JOptionPane.showMessageDialog(null,"resultado de multiplicacion: " + multiplicacion);
        } else {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
}
