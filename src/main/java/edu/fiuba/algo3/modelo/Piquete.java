package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.jugador.Jugador;

public class Piquete implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.getVehiculo().piquete(jugador);
        jugador.sumarMovimientos(1);

    }
}
