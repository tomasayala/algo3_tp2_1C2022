package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Jugador;
import edu.fiuba.algo3.modelo.Nulo;
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