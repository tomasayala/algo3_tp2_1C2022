package edu.fiuba.algo3.modelo.modificador;

import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.vehiculos.IVehiculo;

public class Desfavorable implements Modificador, Sorpresa {

    @Override
    public void cruzarCon(Jugador jugador) {

        Desfavorable desfavorable = new Desfavorable();
        jugador.aplicarSorpresa(desfavorable);

        jugador.sumarMovimientos(NUMERO_DE_MOVIMIENTOS);
    }

    @Override
    public long aplicarA(IVehiculo vehiculo) {
        return 0;
    }

    @Override
    public int aplicarSorpresa(long movimientos) {
        return (Math.toIntExact(Math.round(
            movimientos * 1.25
        )));
    }

}
