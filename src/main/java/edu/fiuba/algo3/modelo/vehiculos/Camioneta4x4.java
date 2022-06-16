package edu.fiuba.algo3.modelo.vehiculos;

import edu.fiuba.algo3.modelo.jugador.Jugador;

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
    public long pozo() {
        int penalizacion = 0;
        this.pozosAtravezados ++;
        
        if(pozosAtravezados > 3) penalizacion = 2;
        //jugador.sumarMovimientos(penalizacion);
        return penalizacion;
    }

    @Override
    public void piquete(Jugador jugador) {
        // TODO
    }

    @Override
    public long controlPolicial() {
        int penalizacion = 0;
        Random random = new Random();
        if(random.nextInt(10) <= this.probabilidadControl) { penalizacion = 3;}
        //jugador.sumarMovimientos(penalizacion);
        //Casteo a long
        long longNum = penalizacion;
        return longNum;
    }
}
