package edu.fiuba.algo3.modelo.celda;

import java.util.ArrayList;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.direccion.Direccion;

public class Celda {
    private Integer f;
    private Integer c;

    public Celda(Integer f, Integer c) {
        this.f = f;
        this.c = c;
    }

    private ArrayList<Celda> obtenerEsquinas() {
        ArrayList<Celda> esquinas = new ArrayList<Celda>();
        return esquinas;
    }

    public Celda mover(Jugador jug, Direccion dir) {
        return null;
    }
}
