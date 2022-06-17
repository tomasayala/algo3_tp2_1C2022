package edu.fiuba.algo3.modelo.vehiculos;

import edu.fiuba.algo3.modelo.jugador.Jugador;

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
    public long pozo() {
        long movimientos = 3; // puse long por las dudas, como no hardcodear 3 en auto y moto?
        return movimientos;
        //jugador.sumarMovimientos(3);
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
