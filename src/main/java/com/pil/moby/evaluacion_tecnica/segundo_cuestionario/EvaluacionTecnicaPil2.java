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
        resolverPunto1(inicializarCandidatos());

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



    private static void resolverPunto1(List<Candidato> candidatos) {
        // TODO: Realizar implementación.

        for (int i = 0; i < 1; ++i){
            System.out.println(candidatos.toString());
        }

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

        List<Tecnologia> tecnologias1 = new ArrayList<>();
        tecnologias1.add(new Tecnologia(1L, "Java"));
        tecnologias1.add(new Tecnologia(2L, "Angular"));
        tecnologias1.add(new Tecnologia(3L, "SQL"));
        //////////////////////////////////////////////////////////////////
        List<Tecnologia> tecnologias2 = new ArrayList<>();
        tecnologias2.add(new Tecnologia(8L, "NodeJS"));
        tecnologias2.add(new Tecnologia(1L, "Java"));
        tecnologias2.add(new Tecnologia(3L, "SQL"));
        //////////////////////////////////////////////////////////////////
        List<Tecnologia> tecnologias3 = new ArrayList<>();
        tecnologias3.add(new Tecnologia(7L, "MongoDB"));
        tecnologias3.add(new Tecnologia(4L, "NoSQL"));
        //////////////////////////////////////////////////////////////////
        List<Tecnologia> tecnologias4 = new ArrayList<>();
        tecnologias4.add(new Tecnologia(5L, "Vue"));
        tecnologias4.add(new Tecnologia(3L, "SQL"));
        tecnologias4.add(new Tecnologia(1L, "Java"));
        //////////////////////////////////////////////////////////////////
        List<Tecnologia> tecnologias5 = new ArrayList<>();
        tecnologias5.add(new Tecnologia(1L, "Java"));
        //////////////////////////////////////////////////////////////////
        List<Tecnologia> tecnologias6 = new ArrayList<>();
        tecnologias6.add(new Tecnologia(1L, "Java"));
        tecnologias6.add(new Tecnologia(2L, "Angular"));
        tecnologias6.add(new Tecnologia(3L, "SQL"));
        //////////////////////////////////////////////////////////////////
        List<Tecnologia> tecnologias7 = new ArrayList<>();
        tecnologias7.add(new Tecnologia(3L, "SQL"));
        tecnologias7.add(new Tecnologia(5L, "Vue"));
        tecnologias7.add(new Tecnologia(1L, "Java"));
        //////////////////////////////////////////////////////////////////
        List<Tecnologia> tecnologias8 = new ArrayList<>();
        tecnologias8.add(new Tecnologia(4L, "NoSQL"));
        tecnologias8.add(new Tecnologia(7L, "MongoBD"));
        tecnologias8.add(new Tecnologia(3L, "SQL"));
        tecnologias8.add(new Tecnologia(1L, "Java"));
        //////////////////////////////////////////////////////////////////
        List<Tecnologia> tecnologias9 = new ArrayList<>();
        tecnologias9.add(new Tecnologia(6L, ".NET"));
        tecnologias9.add(new Tecnologia(1L, "Java"));
        tecnologias9.add(new Tecnologia(2L, "Angular"));
        //////////////////////////////////////////////////////////////////
        List<Tecnologia> tecnologias10 = new ArrayList<>();
        tecnologias10.add(new Tecnologia(1L, "Java"));
        tecnologias10.add(new Tecnologia(6L, ".NET"));
        tecnologias10.add(new Tecnologia(2L, "Angular"));


        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(new Candidato(3L, "Jhon", "Doe", 5000D, 2, tecnologias1));
        candidatos.add(new Candidato(7L, "Matias", "Otamendi", 3000D, 9, tecnologias2));
        candidatos.add(new Candidato(1L, "Joaquin", "Tagliafico", 2000D, 6, tecnologias3));
        candidatos.add(new Candidato(4L, "Gastón", "Mac Allister", 5000.50, 1, tecnologias4));
        candidatos.add(new Candidato(5L, "Pablo", "De Paul", 9000.50, 4, tecnologias5));
        candidatos.add(new Candidato(2L, "Lucas", "Di Maria", 6000D, 7, tecnologias6));
        candidatos.add(new Candidato(10L, "Lionel", "Messi", 10000.10, 10, tecnologias7));
        candidatos.add(new Candidato(9L, "Julian", "Álvarez", 5000D, 3, tecnologias8));
        candidatos.add(new Candidato(8L, "Lula", "Martinez", 1000D, 2, tecnologias9));
        candidatos.add(new Candidato(6L, "Agustín", "Dybala", 1000D, 2, tecnologias10));

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