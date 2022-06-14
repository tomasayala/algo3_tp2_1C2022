package edu.fiuba.algo3.modelo.modificador;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.vehiculos.Moto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DesfavorableTest {

    @Test
    public void  modificadorDesfavorableSeCruzaConJugador() {
        //Arrange
        Desfavorable desfavorable = new Desfavorable();
        Celda celda = new Celda(0, 0);
        Moto moto = new Moto();
        Jugador jugador = new Jugador(moto);
        jugador.asignarCeldaInicial(celda);

        jugador.sumarMovimientos(10);

        //Act
        desfavorable.cruzarCon(jugador);
        //Assert
        assertEquals(Math.round((10 * 1.25)+1), jugador.movimientos()); //Suma el 25% de los movimientos hechos + 1 movimiento
    }
    @Test
    public void modificadorDesfavorableSeCruzaConJugadorCon10MovimientosYJugadorQuedaCon14Movimientos() {
        Desfavorable desfavorable = new Desfavorable();
        Celda celda = new Celda(0, 0);
        Moto moto = new Moto();
        Jugador jugador = new Jugador(moto);
        jugador.asignarCeldaInicial(celda);

        jugador.sumarMovimientos(10);

        desfavorable.cruzarCon(jugador);

        assertEquals(Math.round((10 * 1.25) + 1), jugador.movimientos()); //Suma el 25% de los movimientos hechos + 1 movimiento. Redondea 13,5 a 14

    }

    @Test
    public void modificadorDesfavorableSeCruzaConJugadorConMovimientos25YJugadorQuedaCon32Movimientos() {
        Desfavorable desfavorable = new Desfavorable();
        Celda celda = new Celda(0, 0);
        Moto moto = new Moto();
        Jugador jugador = new Jugador(moto);
        jugador.asignarCeldaInicial(celda);

        jugador.sumarMovimientos(25);

        desfavorable.cruzarCon(jugador);

        assertEquals(32, jugador.movimientos()); //Suma el 25% de los movimientos hechos + 1 movimiento. Redondea 32.25 a 32.

    }

}