package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.jugador.Jugador;

public class Tablero {
    private Jugador jugador;
    // private ICelda[][] celdas;

    public Tablero(int filas, int columnas) {
        // this.celdas = new ICelda[filas][columnas];
        
        // for (int i = 0; i < filas; i++) {
        //     for (int j = 0; j < columnas; j++) {
        //         this.celdas[i][j] = new MockCelda();
        //     }
        // } 
    }

    public void iniciarEn(Celda celda) {
        // this.jugador.setPosicion(celda);
    }

    public void asociarJudador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void mover(Direccion direccion) {
        // jugador.mover(this.jugador, direccion);
    }
}
