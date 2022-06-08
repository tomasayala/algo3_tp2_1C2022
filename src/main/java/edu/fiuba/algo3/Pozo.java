package edu.fiuba.algo3;

public class Pozo implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.getVehiculo().pozo(jugador);
        jugador.sumarMovimientos(1);

    }
}