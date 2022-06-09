package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.jugador.Jugador;

public class Nulo implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.sumarMovimientos(1);

    }
}
