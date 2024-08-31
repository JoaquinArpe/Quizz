package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Quizz {
    private ArrayList<Pregunta> preguntas;
    private int puntuacionTotal;

    public Quizz() {
        preguntas = new ArrayList<>();
        puntuacionTotal = 0;
    }

    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        try {
            for (Pregunta pregunta : preguntas) {
                System.out.println(pregunta.getEnunciado());
                String respuesta = sc.nextLine();
                if (pregunta.verificarRespuestas(respuesta)) {
                    System.out.println("¡Correcto!");
                    puntuacionTotal += pregunta.getPuntos();
                } else {
                    System.out.println("Incorrecto. La respuesta correcta era: " + pregunta.getRespuestaCorrecta());
                }
            }
        } catch (Exception e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        } finally {
            sc.close();
        }
        System.out.println("Tu puntuación total es: " + puntuacionTotal);
    }
}
