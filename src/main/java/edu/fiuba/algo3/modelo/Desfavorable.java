package edu.fiuba.algo3.modelo;

public class Desfavorable implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.sorpresaDesfavorable();
        jugador.sumarMovimientos(1);

    }
}
