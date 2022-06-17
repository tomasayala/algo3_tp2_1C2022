package edu.fiuba.algo3.modelo.celda;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.calle.Calle;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.vehiculos.Vehiculo;

public class Celda {
    
    private long f;
    private long c;
    private ArrayList<Calle> calles;

    public Celda(long f, long c) {
        this.f = f;
        this.c = c;
        this.calles = new ArrayList<Calle>();
    }

    public long fila() {
        return f;
    }

    public long columna() {
        return c;
    }

    public Celda buscarSiguiente(Direccion direccion) {
        ArrayList<Celda> esquinas = this.obtenerEsquinas();

        return direccion.mover(this.f, this.c, esquinas);
    }

    public void agregarCalle(Calle calle) {
        if (this.calles.size() > 4) throw new Error();

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

    public void mover(Vehiculo vehiculo, Direccion dir) {
        Celda sigCelda = this.buscarSiguiente(dir);
        Calle sigCalle = this.obtenerCalleDeEsquina(sigCelda);
    
        sigCalle.cruzarCon(vehiculo);
    }

    public boolean equals(Celda unaCelda) {
        if (this.fila() != unaCelda.fila()) return false;
        if (this.columna() != unaCelda.columna()) return false;

        return true;
    }

}
