package edu.fiuba.algo3.modelo.modificador;

import edu.fiuba.algo3.modelo.jugador.Jugador;

public class Favorable implements Modificador, Sorpresa {

    @Override
    public void cruzarCon(Jugador jugador) {

        Favorable favorable = new Favorable();
        jugador.sumarMovimientos(NUMERO_DE_MOVIMIENTOS);
        
        jugador.aplicarSorpresa(favorable);
    }

    @Override
    public int aplicarSorpresa(long movimientos) {

        return ( Math.toIntExact(Math.round(movimientos * 0.8)));
    }
}
