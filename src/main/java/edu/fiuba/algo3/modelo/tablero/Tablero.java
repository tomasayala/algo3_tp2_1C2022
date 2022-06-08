package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.celda.ICelda;
import edu.fiuba.algo3.modelo.celda.MockCelda;
import edu.fiuba.algo3.modelo.direccion.IDireccion;
import edu.fiuba.algo3.modelo.jugador.IJugador;

public class Tablero {
    private IJugador jugador;
    // private ICelda[][] celdas;

    public Tablero(int filas, int columnas) {
        // this.celdas = new ICelda[filas][columnas];
        
        // for (int i = 0; i < filas; i++) {
        //     for (int j = 0; j < columnas; j++) {
        //         this.celdas[i][j] = new MockCelda();
        //     }
        // } 
    }

    public void mover(IDireccion direccion) {
        jugador.mover(this.jugador, direccion);
    }
}
