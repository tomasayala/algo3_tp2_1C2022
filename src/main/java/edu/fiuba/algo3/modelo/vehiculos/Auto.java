package edu.fiuba.algo3.modelo.vehiculos;

import java.util.Random;
import edu.fiuba.algo3.modelo.vehiculos.Jugador;

public class Auto implements IVehiculo{

    private int probabilidadControl;

    public Auto()
    {
        this.probabilidadControl = 5;
    }

    @Override
    public IVehiculo reemplazarVehiculo() {
        return new Camioneta4x4();
    }

    @Override
    public void pozo(Jugador jugador) {
       pozo.sumarMovimientos(3);
    }

    @Override
    public void piquete(Jugador jugador) {
        //jugador.sumarMovimientos(1);
    }

    @Override
    public void controlPolicial(Jugador jugador) {
        int penalizacion = 0;
        Random random = new Random();
        if(random.nextInt(10) <= this.probabilidadControl) { penalizacion = 3;}
        jugador.sumarMovimientos(penalizacion);
    }
}
