package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.vehiculos.Auto;
import edu.fiuba.algo3.modelo.vehiculos.Camioneta4x4;
import edu.fiuba.algo3.modelo.vehiculos.Moto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CambioDeVehiculoTest {

    @Test
    public void modificadorCambioDeVehiculoSeCruzaConJugadorConMoto() {

        CambioDeVehiculo cambioDeVehiculo = new CambioDeVehiculo();
        Celda celda = new Celda(0, 0);
        Moto moto = new Moto();
        Auto auto = new Auto();
        Jugador jugador = new Jugador(moto, celda);

        cambioDeVehiculo.cruzarCon(jugador);

        assertEquals(auto.getClass(), jugador.getVehiculo().getClass());

    }

    @Test
    public void modificadorCambioDeVehiculoSeCruzaConJugadorConAuto() {

        CambioDeVehiculo cambioDeVehiculo = new CambioDeVehiculo();
        Celda celda = new Celda(0, 0);
        Auto auto = new Auto();
        Camioneta4x4 camioneta = new Camioneta4x4();
        Jugador jugador = new Jugador(auto, celda);

        cambioDeVehiculo.cruzarCon(jugador);

        assertEquals(camioneta.getClass(), jugador.getVehiculo().getClass());

    }

    @Test
    public void modificadorCambioDeVehiculoSeCruzaConJugadorConCamioneta() {

        CambioDeVehiculo cambioDeVehiculo = new CambioDeVehiculo();
        Celda celda = new Celda(0, 0);
        Camioneta4x4 camioneta = new Camioneta4x4();
        Moto moto = new Moto();
        Jugador jugador = new Jugador(camioneta, celda);

        cambioDeVehiculo.cruzarCon(jugador);

        assertEquals(moto.getClass(), jugador.getVehiculo().getClass());

    }
}