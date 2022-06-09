package edu.fiuba.algo3.modelo.calle;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.modificadores.Modificador;

public class Calle {
    private Modificador modificador;
    private ArrayList<Celda> celdas;

    public Calle(Celda esq1, Celda esq2, Modificador modificador) {
        this.celdas = new ArrayList<Celda>();
        this.celdas.add(esq1);
        this.celdas.add(esq2);
        this.modificador = modificador;
    }

    public void cruzarCon(Jugador jugador) {
        this.modificador.cruzarCon(jugador);
    }

    public Celda siguienteEsquina(Celda esquinaActual) {
        // Solo funciona para 2 celdas
        ArrayList<Celda> buscador = celdas;
        buscador.remove(esquinaActual);
        return this.celdas.get(0);
    }

    public boolean contiene(Celda celda) {
        return this.celdas.contains(celda);
    }

    public void asociarCelda(Celda celda) {
        celdas.add(celda);
    }
}
