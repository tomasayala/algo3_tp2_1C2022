package edu.fiuba.algo3.modelo.vehiculos;

import edu.fiuba.algo3.modelo.jugador.Jugador;

public interface IVehiculo {

    IVehiculo reemplazarVehiculo();

    long pozo();

    void piquete(Jugador jugador);

    long controlPolicial();

}