package edu.fiuba.algo3;

public class Favorable implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.sorpresaFavorable();
        jugador.sumarMovimientos(1);

    }
}
