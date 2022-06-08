package edu.fiuba.algo3.modelo.vehiculos;

import java.util.Random;

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
    public int pozo() {
        return 3;
    }

    @Override
    public int piquete() {
        return 2;
    }

    @Override
    public int controlPolicial() {
        int penalizacion = 0;
        Random random = new Random();
        if(random.nextInt(10) <= this.probabilidadControl) { penalizacion = 3;}
        return penalizacion;
    }
}