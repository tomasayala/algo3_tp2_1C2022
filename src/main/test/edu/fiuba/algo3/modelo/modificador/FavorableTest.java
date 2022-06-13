package edu.fiuba.algo3.modelo.modificador;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.vehiculos.Moto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FavorableTest {

    @Test
    void  modificadorFavorableSeCruzaConJugador() {
        //Arrange
        Favorable favorable = new Favorable();
        Celda celda = new Celda(0, 0);
        Moto moto = new Moto();
        Jugador jugador = new Jugador(moto);
        jugador.asignarCeldaInicial(celda);
        jugador.sumarMovimientos(10);

        //Act
        favorable.cruzarCon(jugador);
        //Assert
        assertEquals(Math.round((10 * 0.8)+1), jugador.movimientos()); //Resta el 20% de los movimientos hechos + 1 movimiento
    }

}