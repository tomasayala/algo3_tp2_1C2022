package edu.fiuba.algo3.modelo.celda;

import java.util.ArrayList;
import edu.fiuba.algo3.modelo.direccion.IDireccion;

public interface ICelda {
    public ArrayList<ICelda> obtenerEsquinas();
    
    public ICelda mover(IDireccion direccion);
}
