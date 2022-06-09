package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.jugador.Jugador;

public class CambioDeVehiculo implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.reemplazarVehiculo();

    }
}
