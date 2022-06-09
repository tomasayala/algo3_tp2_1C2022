package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Jugador;
import edu.fiuba.algo3.modelo.Modificador;

public class Pozo implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.getVehiculo().pozo(jugador);
        jugador.sumarMovimientos(1);

    }
}