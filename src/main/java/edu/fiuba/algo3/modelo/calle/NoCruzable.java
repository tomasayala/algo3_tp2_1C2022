package edu.fiuba.algo3.modelo.calle;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.cruzador.Cruzador;

public class NoCruzable implements Cruzador{
    public Celda puedoCruzar(Celda origen, Celda destino) {
        return origen;
    }
}
