package edu.fiuba.algo3.modelo.modificador;

import edu.fiuba.algo3.modelo.jugador.Jugador;

public class Piquete implements Modificador {
    
    @Override
    public void cruzarCon(Jugador jugador) {
        jugador.getVehiculo().piquete(jugador);
        jugador.sumarMovimientos(1);
<<<<<<< HEAD:src/main/java/edu/fiuba/algo3/modelo/modificadores/Piquete.java

=======
>>>>>>> 7b5d412afe88746f6012d3da0eb59f6650b6457a:src/main/java/edu/fiuba/algo3/modelo/modificador/Piquete.java
    }

}
