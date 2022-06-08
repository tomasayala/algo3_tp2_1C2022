package edu.fiuba.algo3.modelo.direccion;

import edu.fiuba.algo3.modelo.celda.ICelda;
import edu.fiuba.algo3.modelo.celda.MockCelda;
import java.util.ArrayList;


public class MockArriba implements IDireccion {

    public ICelda mover(int fila, int columna, ArrayList<ICelda> celdas) {
        // cambiar
        return new MockCelda();   
    }
}
