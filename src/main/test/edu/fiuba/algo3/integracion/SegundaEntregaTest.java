package edu.fiuba.algo3.integracion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.calle.Calle;
import edu.fiuba.algo3.modelo.celda.Celda;
import edu.fiuba.algo3.modelo.direccion.Derecha;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.direccion.Izquierda;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.modificador.CambioDeVehiculo;
import edu.fiuba.algo3.modelo.modificador.Desfavorable;
import edu.fiuba.algo3.modelo.modificador.Favorable;
import edu.fiuba.algo3.modelo.modificador.Modificador;
import edu.fiuba.algo3.modelo.modificador.Pozo;
import edu.fiuba.algo3.modelo.tablero.Tablero;
import edu.fiuba.algo3.modelo.vehiculos.Auto;
import edu.fiuba.algo3.modelo.vehiculos.Camioneta4x4;
import edu.fiuba.algo3.modelo.vehiculos.IVehiculo;
import edu.fiuba.algo3.modelo.vehiculos.Moto;

public class SegundaEntregaTest {
    Tablero tablero = new Tablero(10, 10);
    IVehiculo moto = new Moto();
    Celda celdaInicial = new Celda(0, 0);
    Celda celdaFinal = new Celda(0, 1);
    Direccion direccion = new Derecha();

    @Test
    public void unVehiculoEncuentraUnaSorpresaDesfavorableYElTotalDeMovimientosEsConComaDebeRedondear() {
        IVehiculo vehiculo = new Moto();
        Modificador modificador = new Desfavorable();

        Jugador jugador = iniciarConfig(vehiculo, modificador);

        jugador.sumarMovimientos(4);
        jugador.mover(this.direccion);

        Integer cantidadMovimientosEsperados = 6;

        assertEquals(cantidadMovimientosEsperados, jugador.movimientos());
    }

    @Test
    public void unAutoAtraviesaLaCiudadYEncuentraUnaSorpresaFavorableResta20PorcientoDeMovimientos() {
        IVehiculo auto = new Auto();
        Modificador pozo = new Pozo();

        Jugador jugador = this.iniciarConfig(auto, pozo);

        Celda celda02 = new Celda(0, 2);
        Modificador favorable = new Favorable();

        Calle calle0102 = new Calle(this.celdaFinal, celda02, favorable);
        this.celdaFinal.agregarCalle(calle0102);
        celda02.agregarCalle(calle0102);

        Integer cantMovimientosFinalEsperado = 4;
        
        this.tablero.mover(this.direccion);
        this.tablero.mover(this.direccion);
        
        assertEquals(cantMovimientosFinalEsperado, jugador.movimientos());
    }

    @Test
    public void unaMotoAtraviesaLaCiudadYEncuentraUnaSorpresaFavorableResta20PorcientoDeMoviemientos() {
        IVehiculo moto = new Moto();
        Modificador pozo = new Pozo();

        Jugador jugador = this.iniciarConfig(moto, pozo);

        Celda celda02 = new Celda(0, 2);
        Modificador favorable = new Favorable();

        Calle calle0102 = new Calle(this.celdaFinal, celda02, favorable);
        this.celdaFinal.agregarCalle(calle0102);
        celda02.agregarCalle(calle0102);

        Integer cantMovimientosFinalEsperado = 4;
        
        this.tablero.mover(this.direccion);
        this.tablero.mover(this.direccion);
        
        assertEquals(cantMovimientosFinalEsperado, jugador.movimientos());
    }

    @Test
    public void una4x4AtraviesaLaCiudadYEncuentraUnaSorpresaFavorableResta20PorcientoDeMoviemientos() {
        IVehiculo camioneta4x4 = new Camioneta4x4();
        Modificador pozo = new Pozo();

        Jugador jugador = this.iniciarConfig(camioneta4x4, pozo);

        Celda celda02 = new Celda(0, 2);
        Modificador favorable = new Favorable();

        Calle calle0102 = new Calle(this.celdaFinal, celda02, favorable);
        this.celdaFinal.agregarCalle(calle0102);
        celda02.agregarCalle(calle0102);

        Direccion izquierda = new Izquierda();

        Integer cantMovimientosFinalEsperado = 3;
        
        this.tablero.mover(this.direccion);
        this.tablero.mover(izquierda);
        this.tablero.mover(this.direccion); 
        this.tablero.mover(this.direccion);
        
        assertEquals(cantMovimientosFinalEsperado, jugador.movimientos());
    }

    @Test
    public void unAutoAtraviesaLaCiudadYEncuentraUnaSorpresaDesfavorableSuma20PorcientoDeMovimientos() {
        IVehiculo auto = new Auto();
        Modificador pozo = new Pozo();

        Jugador jugador = this.iniciarConfig(auto, pozo);

        Celda celda02 = new Celda(0, 2);
        Modificador desfavorable = new Desfavorable();

        Calle calle0102 = new Calle(this.celdaFinal, celda02, desfavorable);
        this.celdaFinal.agregarCalle(calle0102);
        celda02.agregarCalle(calle0102);

        Integer cantMovimientosFinalEsperado = 6;

        this.tablero.mover(this.direccion);
        this.tablero.mover(this.direccion);

        assertEquals(cantMovimientosFinalEsperado, jugador.movimientos());
    }

    @Test
    public void unaMotoAtraviesaLaCiudadYEncuentraUnaSorpresaDesfavorableSuma20PorcientoDeMovimientos() {
    
        IVehiculo moto = new Moto();
        Modificador pozo = new Pozo();

        Jugador jugador = this.iniciarConfig(moto, pozo);

        Celda celda02 = new Celda(0, 2);
        Modificador desfavorable = new Desfavorable();

        Calle calle0102 = new Calle(this.celdaFinal, celda02, desfavorable);
        this.celdaFinal.agregarCalle(calle0102);
        celda02.agregarCalle(calle0102);

        Integer cantMovimientosFinalEsperado = 6;

        this.tablero.mover(this.direccion);
        this.tablero.mover(this.direccion);

        assertEquals(cantMovimientosFinalEsperado, jugador.movimientos());
    }

    @Test
    public void una4x4AtraviesaLaCiudadYEncuentraUnaSorpresaDesfavorableSuma20PorcientoDeMovimientos() {
        IVehiculo camioneta4x4 = new Camioneta4x4();
        Modificador pozo = new Pozo();

        Jugador jugador = this.iniciarConfig(camioneta4x4, pozo);
        
        Celda celda02 = new Celda(0, 2);
        Modificador desfavorable = new Desfavorable();

        Calle calle0102 = new Calle(this.celdaFinal, celda02, desfavorable);
        this.celdaFinal.agregarCalle(calle0102);
        celda02.agregarCalle(calle0102);

        Direccion izquierda = new Izquierda();

        Integer cantMovimientosFinalEsperado = 5;
        
        this.tablero.mover(this.direccion);
        this.tablero.mover(izquierda);
        this.tablero.mover(this.direccion);
        this.tablero.mover(this.direccion);

        assertEquals(cantMovimientosFinalEsperado, jugador.movimientos());
    }

    public Jugador iniciarConfig(IVehiculo vehiculo, Modificador modificador) {
        Jugador jugador = new Jugador(vehiculo);
        
        this.tablero.agregarJugador(jugador);
        this.tablero.iniciarEn(celdaInicial);
        
        Calle calle = new Calle(this.celdaInicial, this.celdaFinal, modificador);
        
        this.celdaInicial.agregarCalle(calle);
        this.celdaFinal.agregarCalle(calle);
        
        return jugador;
    }

    @Test
    public void unVehiculoEncuentraUnaSorpresaFavorableEnElPrimerMovimientoLosMovimientosTotalesSon1() {
        IVehiculo vehiculo = new Moto();
        Modificador modificador = new Favorable();

        Jugador jugador = iniciarConfig(vehiculo, modificador);

        jugador.mover(direccion);

        Integer cantMovimientosEsperados = 1;

        assertEquals(cantMovimientosEsperados, jugador.movimientos());
    }

    @Test
    public void unVehiculoEncuentraUnaSorpresaFavorableYElTotalDeMovimientosEsConComaDebeRedondear() {
        IVehiculo vehiculo = new Moto();
        Modificador modificador = new Favorable();

        Jugador jugador = iniciarConfig(vehiculo, modificador);

        jugador.sumarMovimientos(3);
        jugador.mover(this.direccion);

        Integer cantidadMovimientosEsperados = 3;

        assertEquals(cantidadMovimientosEsperados, jugador.movimientos());
    }
    
    @Test
    public void unAutoAtraviesaLaCiudadYSeEncuentraConUnCambioDeVehiculoYCambiaPor4X4() {
        IVehiculo auto = new Auto();
        Modificador cambio = new CambioDeVehiculo();

        Jugador jugador = this.iniciarConfig(auto, cambio);

        // Sabemos que la 4x4 penaliza en dos movimientos luego de 2 pozos, de esa manera
        // la diferenciamos (Si se agrega otro vehiculo con misma condicion se debe
        // actualizar el test).

        Celda celda02 = new Celda(0, 2);
        Direccion izquierda = new Izquierda();

        Modificador pozo = new Pozo();
        Calle calle0102 = new Calle(this.celdaFinal, celda02, pozo);

        this.celdaFinal.agregarCalle(calle0102);
        celda02.agregarCalle(calle0102);

        this.tablero.mover(this.direccion);
        
        this.tablero.mover(this.direccion);
        this.tablero.mover(izquierda);
        this.tablero.mover(this.direccion);
        this.tablero.mover(izquierda);

        Integer cantMovimientosFinalEsperado = 7;

        assertEquals(cantMovimientosFinalEsperado, jugador.movimientos());
    }

    @Test
    public void unaMotoAtraviesaLaCiudadYSeEncuentraConUnCambioDeVehiculoYCambiaPorAuto() {
        // IVehiculo auto = new Moto();
        // Modificador cambio = new CambioDeVehiculo();

        // Jugador jugador = this.iniciarConfig(auto, cambio);

        // // Sabemos que a diferencia de una moto, la moto pasa el piquete y el auto no.
        // // Tambien, sabemos que a diferencia de una 4x4, el auto es penalizado en dos movimientos
        // // en el primer pozo que agarre.

        // Celda celda02 = new Celda(0, 2);
        // Celda celda03 = new Celda(0, 3);
        // Modificador pozo = new Pozo();
        // Modificador piquete = new Piquete();

        // Calle calle0102 = new Calle(this.celdaFinal, celda02, pozo);
        // Calle calle0203 = new Calle(this.celdaFinal, celda03, piquete);

        // this.celdaFinal.agregarCalle(calle0102);
        // celda02.agregarCalle(calle0102);
        // celda02.agregarCalle(calle0203);
        // celda03.agregarCalle(calle0203);

        // this.tablero.mover(this.direccion);
        // this.tablero.mover(this.direccion);

        // // No es 4x4
        // assertEquals(5, jugador.movimientos());

        // // No es moto
        // this.tablero.mover(this.direccion);
        // assertEquals(6, jugador.movimientos());
    }

}
