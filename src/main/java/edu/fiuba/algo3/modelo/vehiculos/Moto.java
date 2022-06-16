package edu.fiuba.algo3.modelo.vehiculos;

import edu.fiuba.algo3.modelo.jugador.Jugador;

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
    public long pozo() {
        long movimientos = 3;
        return movimientos;
        //jugador.sumarMovimientos(3);
    }

    @Override
    public void piquete(Jugador jugador) {
        jugador.sumarMovimientos(2);
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