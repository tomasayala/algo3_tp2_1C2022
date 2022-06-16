package edu.fiuba.algo3.modelo.modificador;

import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.vehiculos.IVehiculo;

public interface Modificador {

    public static final int NUMERO_DE_MOVIMIENTOS = 1;

    void cruzarCon(Jugador jugador);

    long aplicarA(IVehiculo vehiculo);
}
