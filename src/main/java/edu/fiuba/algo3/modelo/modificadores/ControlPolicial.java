package edu.fiuba.algo3.modelo.modificadores;

import edu.fiuba.algo3.modelo.jugador.Jugador;

public class ControlPolicial implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.getVehiculo().controlPolicial(jugador);
        jugador.sumarMovimientos(1);
    }
}
