package edu.fiuba.algo3.modelo.direccion;
import java.util.ArrayList;
import edu.fiuba.algo3.modelo.celda.Celda;

public class Derecha implements Direccion {
    
    @Override
    public Celda mover(Integer f, Integer c, ArrayList<Celda> esquinas) {
        return esquinas.get(1);
    }
}
