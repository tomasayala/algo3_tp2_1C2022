package edu.fiuba.algo3.modelo.vehiculos;

import java.util.Random;
import edu.fiuba.algo3.modelo.vehiculos.Jugador;

public class Camioneta4x4 implements IVehiculo{

    private int probabilidadControl;
    private int pozosAtravezados;

    public Camioneta4x4()
    {
        this.probabilidadControl = 3;
        this.pozosAtravezados = 0;
    }

    @Override
    public IVehiculo reemplazarVehiculo() {
        return new Moto();
    }

    @Override
    public void pozo(Jugador jugador) {
        int penalizacion = 0;
        this.pozosAtravezados ++;
        if(pozosAtravezados < 3){ penalizacion = 3;}
        return penalizacion;
    }

    @Override
    public void piquete(Jugador jugador) {
        //return 0;
    }

    @Override
    public void controlPolicial(Jugador jugador) {
        int penalizacion = 0;
        Random random = new Random();
        if(random.nextInt(10) <= this.probabilidadControl) { penalizacion = 3;}
        jugador.sumarMovimientos(penalizacion);
    }
}
