package edu.fiuba.algo3.modelo.modificador;

import edu.fiuba.algo3.modelo.jugador.Jugador;

public class Favorable implements Modificador {

    @Override
    public void cruzarCon(Jugador jugador) {
        jugador.sorpresaFavorable();
        jugador.sumarMovimientos(1);
<<<<<<< HEAD:src/main/java/edu/fiuba/algo3/modelo/modificadores/Favorable.java

=======
>>>>>>> 7b5d412afe88746f6012d3da0eb59f6650b6457a:src/main/java/edu/fiuba/algo3/modelo/modificador/Favorable.java
    }
    
}
