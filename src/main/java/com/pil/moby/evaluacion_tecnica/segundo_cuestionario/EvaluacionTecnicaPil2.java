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

        // Desarrollo de la consigna 1.
        inicializarCandidatos();

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

    public void inicializarCandidatos(List<Candidato>) {
        // TODO: Realizar implementación.
        List<Tecnologia> tecnologias = new ArrayList<Tecnologia>();
        tecnologias.add(1, new Tecnologia(1L, "Java"));
        tecnologias.add(2, new Tecnologia(2L, "Angular"));
        tecnologias.add(3, new Tecnologia(3L, "SQL"));
        tecnologias.add(4, new Tecnologia(4L, "NoSQL"));
        tecnologias.add(5, new Tecnologia(5L, "Vue"));
        tecnologias.add(6, new Tecnologia(6L, ".NET"));
        tecnologias.add(7, new Tecnologia(7L, "MongoDB"));

        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(new Candidato(3L, "Jhon", "Doe", 5000.00, 2));
        candidatos.add(new Candidato(7L, "Matias", "Otamendi", 3000.00, 9));
        candidatos.add(new Candidato(1L, "Joaquin", "Tagliafico", 2000.00, 6));
        candidatos.add(new Candidato())

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