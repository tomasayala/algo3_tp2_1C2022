package edu.fiuba.algo3.modelo.calle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.jugador.Jugador;

public class CalleTest {
    
    @Test
    public void agregoDosCeldasAUnaCalleYVerificoQueLasContenga() {
        Calle calle = new Calle();

        Celda primerCelda = new Celda(0, 0);
        Celda segundaCelda = new Celda(0, 1);

        calle.agregarCelda(primerCelda);
        calle.agregarCelda(segundaCelda);

        assertEquals(calle.contiene(primerCelda), true);
        assertEquals(calle.contiene(segundaCelda), true);
    }

    @Test
    public void agregoDosCeldasAUnaCalleYObtengoLaSiguienteESquina() {
        Calle calle = new Calle();

        Celda primerCelda = new Celda(0, 0);
        Celda segundaCelda = new Celda(0, 1);

        calle.agregarCelda(primerCelda);
        calle.agregarCelda(segundaCelda);

        assertEquals(calle.siguienteEsquina(primerCelda), segundaCelda);
    }

}
