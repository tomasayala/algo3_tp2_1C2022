package edu.fiuba.algo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NuloTest {

    @Test
    public void modificadorNuloSeCruzaConJugador(){

        //Arrange
        Nulo modificadorNulo = new Nulo();
        Jugador jugador = new Jugador();

        //Act
        modificadorNulo.cruzarCon(jugador);

        //Assert
        assertEquals(1, jugador.movimientos());

    }

}