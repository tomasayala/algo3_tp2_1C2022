package edu.fiuba.algo3.modelo.calle;

import edu.fiuba.algo3.modelo.celda.ICelda;
import edu.fiuba.algo3.modelo.jugador.IJugador;

public interface ICalle {
    public void asociarCeldas(ICelda nuevaCelda);

    public void cruzarCon(IJugador jugador);

    public ICelda proximaEsquina(ICelda esquinaActual);

    public boolean contiene(ICelda celda);
}
