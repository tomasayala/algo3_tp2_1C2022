package edu.fiuba.algo3.modelo.vehiculos;

import java.util.Random;
import edu.fiuba.algo3.modelo.vehiculos.Jugador;


public class Moto implements IVehiculo{
    private int probabilidadControl;

    public Moto()
    {
        this.probabilidadControl = 8;
    }

    @Override
    public IVehiculo reemplazarVehiculo() {
        return new Auto();
    }

    @Override
    public void pozo(Jugador jugador) {
        jugador.sumarMovimientos(3);
    }

    @Override
    public void piquete(Jugador jugador) {
        //return 2;
    }

    @Override
    public void controlPolicial(Jugador jugador) {
        int penalizacion = 0;
        Random random = new Random();
        if(random.nextInt(10) <= this.probabilidadControl) { penalizacion = 3;}
        jugador.sumarMovimientos(penalizacion);
    }
}
