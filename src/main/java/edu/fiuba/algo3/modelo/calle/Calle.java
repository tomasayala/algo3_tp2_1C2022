package edu.fiuba.algo3.modelo.calle;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.modificador.IModificador;

public class Calle {
    private IModificador modificador;
    private ArrayList<Celda> celdas;

    public void agregarCelda(Celda celda) {
        celdas.add(celda);
    }

    public void cruzarCon(Jugador jugador) {
        this.modificador.cruzarCon(jugador);
    }

    public Celda siguienteEsquina(Celda esquinaActual) {
    //    FALTA HACER
        return this.celdas.get(0);
    }

    public boolean contiene(Celda celda) {
        return this.celdas.contains(celda);
    }
}
