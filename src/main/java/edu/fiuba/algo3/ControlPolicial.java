package edu.fiuba.algo3;

public class ControlPolicial implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.getVehiculo().controlPolicial(jugador);
        jugador.sumarMovimientos(1);

    }
}
