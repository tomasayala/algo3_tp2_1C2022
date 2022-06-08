package edu.fiuba.algo3.modelo;

public class CambioDeVehiculo implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {

        jugador.reemplazarVehiculo();
        jugador.sumarMovimientos(1);

    }
}
