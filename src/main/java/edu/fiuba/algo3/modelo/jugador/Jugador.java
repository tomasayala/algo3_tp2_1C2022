package edu.fiuba.algo3.modelo.jugador;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.vehiculos.IVehiculo;

public class Jugador {
    private IVehiculo vehiculo;
    private long movimientos;
    private Celda celdaActual;

    public Jugador(IVehiculo unVehiculo, Celda celdaInicial) {
        this.vehiculo = unVehiculo;
        this.movimientos = 0;
        this.celdaActual = celdaInicial;
    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public Celda getPosicion() {
        return this.celdaActual;
    }

    public void sorpresaFavorable() {
        this.movimientos = Math.round(this.movimientos * 0.8);
    }

    public void sorpresaDesfavorable() {
        this.movimientos = Math.round(this.movimientos * 1.25);
    }

    public void reemplazarVehiculo() {
        this.vehiculo = this.vehiculo.reemplazarVehiculo();
    }

    public void sumarMovimientos(int suma) {
        this.movimientos += suma;
    }

    public void restarMovimientos(int resta) {
        this.movimientos -= resta;
    }

    public void mover(Direccion dir) {
        this.celdaActual = this.celdaActual.mover(this, dir);
    }
}
