package edu.fiuba.algo3.modelo.calle;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.celda.ICelda;
import edu.fiuba.algo3.modelo.jugador.IJugador;
import edu.fiuba.algo3.modelo.modificador.IModificador;

public class Calle implements ICalle {
    private IModificador modificador;
    private ArrayList<ICelda> celdas;

    public void asociarCeldas(ICelda nuevaCelda) {
        this.celdas.add(nuevaCelda);
    }

    public void cruzarCon(IJugador jugador) {
        this.modificador.cruzarCon(jugador);
    }

    public ICelda proximaEsquina(ICelda esquinaActual) {
        // hay que cambiar
        return this.celdas.get(0);
    }

    public boolean contiene(ICelda celda) {
        return this.celdas.contains(celda);
    }
}
