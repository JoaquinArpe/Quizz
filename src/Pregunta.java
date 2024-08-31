package org.example;

public class Pregunta {
    private String enunciado;
    private String respuestaCorrecta;
    private int puntos;

    public Pregunta(String enunciado, String respuestaCorrecta, int puntos) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntos = puntos;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public int getPuntos() {
        return puntos;
    }

    public boolean verificarRespuestas(String respuesta) {
        return respuesta.equalsIgnoreCase(respuestaCorrecta);
    }
}
