package edu.fiuba.algo3.modelo.direccion;

import java.util.ArrayList;
import edu.fiuba.algo3.modelo.celda.ICelda;

public interface IDireccion {
    public ICelda mover(int fila, int columna, ArrayList<ICelda> celdas);
}
