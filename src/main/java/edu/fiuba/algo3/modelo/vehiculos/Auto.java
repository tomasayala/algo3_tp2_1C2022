package edu.fiuba.algo3.modelo.vehiculos;

import java.util.Random;

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
    public int pozo() {
        return 3;
    }

    @Override
    public int piquete() {
        return 0;
    }

    @Override
    public int controlPolicial() {
        int penalizacion = 0;
        Random random = new Random();
        if(random.nextInt(10) <= this.probabilidadControl) { penalizacion = 3;}
        return penalizacion;
    }
}
