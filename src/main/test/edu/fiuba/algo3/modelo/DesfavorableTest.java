package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Desfavorable;
import edu.fiuba.algo3.modelo.Jugador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesfavorableTest {

    @Test
    void modificadorDesfavorableSeCruzaConJugador() {

        //Arrange
        Desfavorable modificadorDesfavorable = new Desfavorable();
        Jugador jugador = new Jugador();
        //float movimientosActualizados = jugador.movimientos() * 1,25);
        //int movimientosRedondeados = Math.round(movimientosActualizados);
        //Act
        modificadorDesfavorable.cruzarCon(jugador);
        //Assert
        assertEquals(1, jugador.movimientos()); //suma 25% + 1 movimiento

    }
}