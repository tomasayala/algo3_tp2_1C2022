package edu.fiuba.algo3.modelo;

public class Jugador {

    private int movimientos;
    private Vehiculo vehiculo;

    public Jugador(){
        movimientos = 0;
    }

    public Vehiculo getVehiculo(){

        return vehiculo;
    }

    public void sorpresaFavorable(){

    }
    public void sorpresaDesfavorable(){

    }
    public void sumarMovimientos(int numMovimientos) {

        movimientos = movimientos + 1;

    }

    public void restarMovimientos() {

    }

    public void reemplazarVehiculo() {

    }

    public int movimientos() {

        return movimientos;
    }

}
