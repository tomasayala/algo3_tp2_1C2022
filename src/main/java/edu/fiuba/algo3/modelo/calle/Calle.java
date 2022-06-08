package edu.fiuba.algo3.modelo.calle;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.jugador.IJugador;
import edu.fiuba.algo3.modelo.modificador.IModificador;

public class Calle implements ICalle{
    private IModificador modificador;
    private ArrayList<Celda> celdas;

    public void cruzarCon(IJugador jugador) {
        modificador.cruzarCon(jugador);
    }

    public ICelda proximaEsquina(Celda esquinaActual) {
        // cambiar
        return this.celdas.get(0);
    }

    public boolean contiene(Celda celda) {
        return false;
    }

}
