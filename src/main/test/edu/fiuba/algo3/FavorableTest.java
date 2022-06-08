package edu.fiuba.algo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FavorableTest {

    @Test
    void modificadorFavorableSeCruzaConJugador() {

        //Arrange
        Favorable modificadorFavorable = new Favorable();
        Jugador jugador = new Jugador();
        //float movimientosActualizados = jugador.movimientos() * 0.8);
        //int movimientosRedondeados = Math.round(movimientosActualizados);
        //Act
        modificadorFavorable.cruzarCon(jugador);
        //Assert
        assertEquals(1, jugador.movimientos()); //Resta el 20% de los movimientos hechos + 1 movimiento

    }

}