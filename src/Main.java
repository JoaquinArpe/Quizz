package org.example;

public class Main {
    public static void main(String[] args) {
        Quizz quiz = new Quizz();
        quiz.agregarPregunta(new Pregunta("¿Cuál es la capital de Francia?", "París", 10));
        quiz.agregarPregunta(new Pregunta("¿Cuál es la capital de Japón?","Tokio", 10));
        quiz.agregarPregunta(new Pregunta("¿Cuál es la capital de Australia?","Canberra", 10));
        quiz.agregarPregunta(new Pregunta("¿Cuál es la capital de España?", "Madrid", 10));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Brasil","Brasilia", 10));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de India","Nueva Delhi", 10));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Egipto", "El Cairo", 10));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de China", "Pekin",10));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Suecia","Estocolmo",10));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Grecia","Atenas",10));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Mongolia","Ulaanbaatar",15));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Marruecos","Rabat",15));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Portugal","Lisboa",10));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Islandia","Reikiavik",15));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Nueva Zelanda", "Wellington",15));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Vietnam","Hanoi",15));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Haití","Puerto Principe",10));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Honduras","Tegucigalpa",10));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Qatar", "Doha",10));
        quiz.agregarPregunta(new Pregunta("Cuál es la capital de Líbano","Beirut",10));

        quiz.iniciar();
    }
}