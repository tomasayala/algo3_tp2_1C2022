package edu.fiuba.algo3.modelo.jugador;

import edu.fiuba.algo3.modelo.direccion.IDireccion;

public interface IJugador {

    public void sumarMovimientos();

    public void restarMovimientos();
    
    public void reemplazarVehiculo();
    
    public void mover(IJugador jugador, IDireccion direccion);
    
    public int movimientos();
}
