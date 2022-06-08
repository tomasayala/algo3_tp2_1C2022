package edu.fiuba.algo3;

public class Piquete implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.getVehiculo().piquete(jugador);
        jugador.sumarMovimientos(1);

    }
}
