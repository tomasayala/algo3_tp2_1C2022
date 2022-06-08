package edu.fiuba.algo3;

public class Nulo implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.sumarMovimientos(1);
    }
}
