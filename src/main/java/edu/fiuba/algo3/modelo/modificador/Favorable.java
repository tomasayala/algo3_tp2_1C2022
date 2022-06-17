package edu.fiuba.algo3.modelo.modificador;

import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.vehiculos.IVehiculo;

public class Favorable implements Modificador, Sorpresa {

    @Override
    public void cruzarCon(Jugador jugador) {

        Favorable favorable = new Favorable();
        jugador.sumarMovimientos(NUMERO_DE_MOVIMIENTOS);
        
        jugador.aplicarSorpresa(favorable);
    }

    @Override
    public long aplicarA(IVehiculo vehiculo) {
        return 0;
    }

    @Override
    public int aplicarSorpresa(long movimientos) {
        return (Math.toIntExact(Math.round(
            movimientos * COEFICIENTE_FAVORABLE
        )));
    }

}
