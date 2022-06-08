package edu.fiuba.algo3.modelo.celda;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.calle.Calle;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.jugador.Jugador;

public class Celda {
    
    private Integer f;
    private Integer c;
    private ArrayList<Calle> calles;

    public Celda(Integer f, Integer c) {
        this.f = f;
        this.c = c;
        this.calles = new ArrayList<Calle>();
    }

    public Integer fila() {
        return f;
    }

    public Integer columna() {
        return c;
    }

    public void agregarCalle(Calle calle) {
        if (this.calles.size() >= 4) throw new Error();

        this.calles.add(calle);
    }

    private ArrayList<Celda> obtenerEsquinas() {
        ArrayList<Celda> esquinas = new ArrayList<Celda>();
        
        for (Calle calle : this.calles) {
            esquinas.add(calle.siguienteEsquina(this));
        }

        return esquinas;
    }

    private Calle obtenerCalleDeEsquina(Celda fin) {
        for (Calle calle : this.calles) {
            if (calle.contiene(fin)) return calle;
        }

        throw new Error("No se encontro la calle");
    }

    public Celda mover(Jugador jug, Direccion dir) {
        ArrayList<Celda> esquinas = this.obtenerEsquinas();
        
        Celda sigCelda = dir.mover(f, c, esquinas);
        Calle sigCalle = this.obtenerCalleDeEsquina(sigCelda);
        
        sigCalle.cruzarCon(jug);

        return sigCelda;
    }

}
