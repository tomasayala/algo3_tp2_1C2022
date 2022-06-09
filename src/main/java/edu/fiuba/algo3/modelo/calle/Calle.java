package edu.fiuba.algo3.modelo.calle;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.Modificador;
import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.jugador.Jugador;

public class Calle {
    private ArrayList<Modificador> modificadores;
    private ArrayList<Celda> celdas;

    public Calle() {
        this.celdas = new ArrayList<Celda>();
        this.modificadores = new ArrayList<Modificador>();
    }

    public void agregarCelda(Celda celda) {
        celdas.add(celda);
    }

    public void agregarModificador(Modificador modificador) {
        this.modificadores.add(modificador);
    }

    public void cruzarCon(Jugador jugador) {
        for (Modificador mod : this.modificadores) {
            mod.cruzarCon(jugador);
        }
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

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Calle)) {
            return false;
        }
        Calle c = (Calle) obj;
        
        for (Celda celda : c.celdas) {
            if (!this.celdas.contains(celda)) {
                return false;
            }
        }
        return true;
    }
}
