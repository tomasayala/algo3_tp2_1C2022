package edu.fiuba.algo3.modelo.vehiculos;

import java.util.Random;

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
    public int pozo() {
        int penalizacion = 0;
        this.pozosAtravezados ++;
        if(pozosAtravezados < 3){ penalizacion = 3;}
        return penalizacion;
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
