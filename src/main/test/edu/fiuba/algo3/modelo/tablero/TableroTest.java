package edu.fiuba.algo3.modelo.tablero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.direccion.Arriba;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.vehiculos.IVehiculo;


public class TableroTest {
    @Test
    public void iniciarElJugadorEnElOrigen() {
        Tablero tablero = new Tablero(5, 5);
        IVehiculo vehiculo = mock(IVehiculo.class);
        Jugador jugador = new Jugador(vehiculo);

        tablero.agregarJugador(jugador);
        
        Celda celdaInicial = new Celda(0, 0);
        
        tablero.iniciarEn(celdaInicial);

        assertEquals(tablero.obtenerPosicion(), celdaInicial);
    }
    
    @Test
    public void noAsociarUnJugadorYMoverDevuelveError() {
        Tablero tablero = new Tablero(5, 5);
        Celda celda = new Celda(0,0);

        assertThrows(RuntimeException.class, () -> tablero.iniciarEn(celda));
    }

    @Test
    public void moverElJugadorFueraDeLimiteDevuelveError() {
        Tablero tablero = new Tablero(5, 5);
        IVehiculo vehiculo = mock(IVehiculo.class);
        Jugador jugador = new Jugador(vehiculo);

        tablero.agregarJugador(jugador);
        tablero.iniciarEn(new Celda(0, 0));

        assertThrows(Error.class, () -> tablero.mover(new Arriba()));
    }
}