package edu.fiuba.algo3.modelo.modificador;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.modificadores.Pozo;
import edu.fiuba.algo3.modelo.vehiculos.Auto;
import edu.fiuba.algo3.modelo.vehiculos.Camioneta4x4;
import edu.fiuba.algo3.modelo.vehiculos.Moto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PozoTest {

    @Test
    public void modificadorPozoSeCruzaConJugadorConMotoYEsPenalizadoCon3() {

        Pozo pozo = new Pozo();
        Celda celda = new Celda(0, 0);
        Moto moto = new Moto();
        Jugador jugador = new Jugador(moto, celda);

        pozo.cruzarCon(jugador);

        assertEquals(4, jugador.movimientos()); //

    }

    @Test
    public void modificadorPozoSeCruzaConJugadorConAutoYEsPenalizadoCon3(){

        Pozo pozo = new Pozo();
        Celda celda = new Celda(0, 0);
        Auto auto = new Auto();
        Jugador jugador = new Jugador(auto, celda);

        pozo.cruzarCon(jugador);

        assertEquals(4, jugador.movimientos());
    }

    @Test
    public void modificadorPozoSeCruzaConJugadorConCamionetaYNoEsPenalizadoPorPrimeraVez(){

        Pozo pozo = new Pozo();
        Celda celda = new Celda(0, 0);
        Camioneta4x4 camioneta = new Camioneta4x4();
        Jugador jugador = new Jugador(camioneta, celda);

        pozo.cruzarCon(jugador);

        assertEquals(1, jugador.movimientos());

    }

    @Test
    public void modificadorPozoSeCruzaConJugadorConCamionetaYEsPenalizadoCon2(){

        Pozo pozo = new Pozo();
        Celda celda = new Celda(0, 0);
        Camioneta4x4 camioneta = new Camioneta4x4();
        Jugador jugador = new Jugador(camioneta, celda);

        for(int i= 0; i < 4; i++){
            pozo.cruzarCon(jugador);
        }

        assertEquals(6, jugador.movimientos());

    }
}