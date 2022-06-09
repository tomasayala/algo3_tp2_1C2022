package edu.fiuba.algo3.modelo.modificadores;

import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.modificadores.Modificador;

public class Nulo implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.sumarMovimientos(1);

    }
}
