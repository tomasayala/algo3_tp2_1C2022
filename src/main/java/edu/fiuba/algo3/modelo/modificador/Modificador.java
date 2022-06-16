package edu.fiuba.algo3.modelo.modificador;

import edu.fiuba.algo3.modelo.jugador.Jugador;

public interface Modificador {

    public static final int NUMERO_DE_MOVIMIENTOS = 1;

    void cruzarCon(Jugador jugador);
}
