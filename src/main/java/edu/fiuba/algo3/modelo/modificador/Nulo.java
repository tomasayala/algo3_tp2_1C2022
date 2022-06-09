package edu.fiuba.algo3.modelo.modificador;

import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.modificador.Modificador;

public class Nulo implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.sumarMovimientos(1);

    }
}
