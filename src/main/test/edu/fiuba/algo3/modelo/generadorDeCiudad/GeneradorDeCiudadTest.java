package edu.fiuba.algo3.modelo.generadorDeCiudad;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.celda.Celda;

public class GeneradorDeCiudadTest {
    @Test
    public void buscarCeldaOrigenDevueveCeldaCorrectamente() {
        GeneradorDeCiudad generador = new GeneradorDeCiudad(4, 4);

        assertEquals(generador.buscarCelda(new Celda(0, 0)), new Celda(0,0));
    }
}
