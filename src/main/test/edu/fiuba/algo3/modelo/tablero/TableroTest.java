package edu.fiuba.algo3.modelo.tablero;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.direccion.Arriba;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.tablero.Tablero;

public class TableroTest {
    @Test
    public void moverElJugadorHaciaArriba() {
        Tablero tablero = new Tablero(5, 5);

        // tablero.iniciarEn(2,0);
        // tablero.mover(new Arriba());

        // assert tablero.obtenerPosicion().equals(new Celda(2, 1));
    }
}