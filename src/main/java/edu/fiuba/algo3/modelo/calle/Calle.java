package edu.fiuba.algo3.modelo.calle;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.modificador.IModificador;

public class Calle {
    private IModificador modificador;
    private ArrayList<Celda> celdas;

    public Calle() {
        this.celdas = new ArrayList<Celda>();
    }

    public void agregarCelda(Celda celda) {
        celdas.add(celda);
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
