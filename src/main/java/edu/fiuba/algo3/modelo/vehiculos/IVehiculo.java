package edu.fiuba.algo3.modelo.vehiculos;
import edu.fiuba.algo3.modelo.vehiculos.Jugador;


public interface IVehiculo {
    IVehiculo reemplazarVehiculo();
    void pozo(Jugador jugador);
    void piquete(Jugador jugador);
    void controlPolicial(Jugador jugador);
}
