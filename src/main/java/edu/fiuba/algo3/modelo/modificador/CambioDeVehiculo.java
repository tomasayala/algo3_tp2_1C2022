package edu.fiuba.algo3.modelo.modificador;

import edu.fiuba.algo3.modelo.calle.Cruzable;
import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.cruzador.Cruzador;
import edu.fiuba.algo3.modelo.jugador.Jugador;


public class CambioDeVehiculo implements Modificador {

    private Cruzador cruzador = new Cruzable();

    @Override
    public void cruzarCon(Jugador jugador) {
        jugador.reemplazarVehiculo();
        jugador.sumarMovimientos(NUMERO_DE_MOVIMIENTOS);
    }

    public Celda puedoCruzar(Celda origen, Celda destino) {
        return this.cruzador.puedoCruzar(origen, destino);
    }
    
}
