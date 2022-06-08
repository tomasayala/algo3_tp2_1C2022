package edu.fiuba.algo3.modelo.celda;

import java.util.ArrayList;
import edu.fiuba.algo3.modelo.calle.Calle;
import edu.fiuba.algo3.modelo.direccion.IDireccion;

public class MockCelda implements ICelda{
    private ArrayList<Calle> calles;
    private int fila;
    private int columna;


    public MockCelda() {

    }

    public ArrayList<ICelda> obtenerEsquinas() {
        ArrayList<ICelda> listaCeldas = new ArrayList<ICelda>();

        for (Calle calle : calles) {
            listaCeldas.add(calle.proximaEsquina(this));
        }

        return listaCeldas;
    }
    
    public ICelda mover(IDireccion direccion) {
        // cambiar
        return this.calles.get(0).proximaEsquina(this);
    }
}
