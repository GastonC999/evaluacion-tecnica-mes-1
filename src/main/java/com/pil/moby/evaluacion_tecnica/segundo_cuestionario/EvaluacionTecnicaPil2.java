package main.java.com.pil.moby.evaluacion_tecnica.segundo_cuestionario;


import main.java.com.pil.moby.evaluacion_tecnica.segundo_cuestionario.modelo.pojo.Candidato;
import main.java.com.pil.moby.evaluacion_tecnica.segundo_cuestionario.modelo.pojo.Tecnologia;

import java.util.ArrayList;
import java.util.List;

public class EvaluacionTecnicaPil2 {

    /**
     * <b>TEMAS:</b><p>
     * - Arreglos y ordenamiento.<p>
     * - POO.<p>
     * - Buenas prácticas + Utilización del IDE.<p>
     * - Java 5, 6, 7 y 8 (<i>Streams, Optionals, Generics, Functional Interfaces</i>).<p>
     */
    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        imprimirMensajePunto(1);
        System.out.println(inicializarCandidatos());
        System.out.println();
        // Desarrollo de la consigna 1.


        resolverPunto1();

        imprimirMensajePunto(2);

        // Desarrollo de la consigna 2.
        resolverPunto2();

        imprimirMensajePunto(3);

        // Desarrollo de la consigna 3.
        resolverPunto3();

        imprimirMensajePunto(4);

        // Desarrollo de la consigna 3.
        resolverPunto4();

        imprimirMensajePunto(5);

        // Desarrollo de la consigna 3.
        resolverPunto5();

    }



    private static void resolverPunto1() {
        // TODO: Realizar implementación.
//        for (Candidato c : candidatos) {
//            System.out.println(candidatos.toString());
//        }
    }

    private static void resolverPunto2() {
        // TODO: Realizar implementación.
    }

    private static void resolverPunto3() {
        // TODO: Realizar implementación.
    }

    private static void resolverPunto4() {
        // TODO: Realizar implementación.
    }

    private static void resolverPunto5() {
        // TODO: Realizar implementación.
    }

    public static List<Candidato> inicializarCandidatos() {
        // TODO: Realizar implementación.
        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(new Candidato(3L, "Jhon", "Doe", 5000D, 2, new Tecnologia(Tecnologia));
        candidatos.add(new Candidato(7L, "Matias", "Otamendi", 3000.00, 9));
        candidatos.add(new Candidato(1L, "Joaquin", "Tagliafico", 2000.00, 6));
        candidatos.add(new Candidato(4L, "Gastón", "Mac Allister", 5000.50, 1));
        candidatos.add(new Candidato(5L, "Pablo", "De Paul", 9000.50, 4));
        candidatos.add(new Candidato(2L, "Lucas", "Di Maria", 6000.00, 7));
        candidatos.add(new Candidato(10L, "Lionel", "Messi", 10000.10, 10));
        candidatos.add(new Candidato(9L, "Julian", "Álvarez", 5000.00, 3));
        candidatos.add(new Candidato(8L, "Lula", "Martinez", 1000.0, 2));
        candidatos.add(new Candidato(6L, "Agustín", "Dybala", 1000.00, 2));

        return candidatos;

    }




    /**
     * Saludo de bienvenida, ignore el método.
     */
    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("\n*******************************************");
        System.out.println("Bienvenidos a la segunda Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    /**
     * Separa de manera bonita cada punto a resolver, ignore el método.
     */
    private static void imprimirMensajePunto(int numeroPunto) {
        System.out.println("\n*******");
        System.out.println("PUNTO " + numeroPunto);
        System.out.println("*******\n");
    }

}