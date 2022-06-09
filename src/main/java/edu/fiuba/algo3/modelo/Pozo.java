package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.jugador.Jugador;

public class Pozo implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.getVehiculo().pozo(jugador);
        jugador.sumarMovimientos(1);

    }
}