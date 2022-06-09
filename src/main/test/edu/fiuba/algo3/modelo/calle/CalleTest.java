package edu.fiuba.algo3.modelo.calle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.vehiculos.IVehiculo;
import edu.fiuba.algo3.modelo.modificadores.Pozo;

public class CalleTest {
    
    @Test
    public void agregoDosCeldasAUnaCalleYVerificoQueLasContenga() {
        Celda primerCelda = new Celda(0, 0);
        Celda segundaCelda = new Celda(0, 1);

        Calle calle = new Calle(primerCelda, segundaCelda, new Pozo());

        assertEquals(calle.contiene(primerCelda), true);
        assertEquals(calle.contiene(segundaCelda), true);
    }

    @Test
    public void agregoDosCeldasAUnaCalleYObtengoLaSiguienteESquina() {
        Celda primerCelda = new Celda(0, 0);
        Celda segundaCelda = new Celda(0, 1);

        Calle calle = new Calle(primerCelda, segundaCelda, new Pozo());

        assertEquals(calle.siguienteEsquina(primerCelda), segundaCelda);
    }

}
