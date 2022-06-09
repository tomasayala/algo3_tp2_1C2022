package edu.fiuba.algo3.modelo.tablero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.direccion.Abajo;
import edu.fiuba.algo3.modelo.direccion.Arriba;
import edu.fiuba.algo3.modelo.direccion.Derecha;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.tablero.Tablero;
import edu.fiuba.algo3.modelo.vehiculos.Moto;


public class TableroTest {
    @Test
    public void iniciarElJugadorEnElOrigen() {
        Tablero t = new Tablero(5, 5);
        Moto m = new Moto();
        Jugador j = new Jugador(m);

        t.asociarJudador(j);
        t.iniciarEn(new Celda(0, 0));

        assertEquals(t.obtenerPosicion(), new Celda(0, 0));
    }

    @Test
    public void moverElJugadorHaciaLaDerecha() {
        Tablero t = new Tablero(5, 5);
        Moto m = new Moto();
        Jugador j = new Jugador(m);

        t.asociarJudador(j);
        t.iniciarEn(new Celda(0, 0));

        t.mover(new Abajo());

        assertEquals(t.obtenerPosicion(), new Celda(1, 0));
    }

    // @Test
    // public void moverElJugadorHaciaLaArribaDevuelveError() {
    //     Tablero t = new Tablero(5, 5);
    //     Moto m = new Moto();
    //     Jugador j = new Jugador(m);

    //     t.asociarJudador(j);
    //     t.iniciarEn(new Celda(0, 0));
        
    //     assertThrows(t.mover(new Arriba()), new Error());
    // }
}