package edu.fiuba.algo3.modelo.jugador;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.modificador.Modificador;
import edu.fiuba.algo3.modelo.modificador.Sorpresa;
import edu.fiuba.algo3.modelo.vehiculos.IVehiculo;

public class Jugador {
    
    private IVehiculo vehiculo;
    private long movimientos;
    private Celda celdaActual;

    public Jugador(IVehiculo unVehiculo) {
        this.vehiculo = unVehiculo;
        this.movimientos = 0;
        this.celdaActual = null;
    }
    public void aplicarModificador(Modificador modificador) {
        this.movimientos += modificador.aplicarA(getVehiculo());
    }

    public void asignarCeldaInicial(Celda unaCelda) {
        this.celdaActual = unaCelda;
    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public Celda getPosicion() {
        return this.celdaActual;
    }

    public void setPosicion(Celda celda) {
        this.celdaActual = celda;
    }

    public void reemplazarVehiculo() {
        this.vehiculo = this.vehiculo.reemplazarVehiculo();
    }

    public void sumarMovimientos(int suma) {
        this.movimientos += suma;
    }

    public void mover(Direccion dir) {
        this.celdaActual = this.celdaActual.mover(this, dir);
    }

    public int movimientos() { return (Math.toIntExact(movimientos)); }

    public void aplicarSorpresa(Sorpresa sorpresa) {
        this.movimientos = (sorpresa.aplicarSorpresa(this.movimientos));
    }

}
