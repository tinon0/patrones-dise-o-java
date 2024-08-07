package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.implementaciones.electricos.CarroceriaElectrica;
import ar.edu.utn.frc.tup.lciii.implementaciones.electricos.MotorElectrico;
import ar.edu.utn.frc.tup.lciii.implementaciones.electricos.RuedaElectricas;
import ar.edu.utn.frc.tup.lciii.implementaciones.gasoleros.CarroceriaGasolera;
import ar.edu.utn.frc.tup.lciii.implementaciones.gasoleros.MotorGasolero;
import ar.edu.utn.frc.tup.lciii.implementaciones.gasoleros.RuedaGasolera;
import ar.edu.utn.frc.tup.lciii.implementaciones.nafteros.CarroceriaNaftera;
import ar.edu.utn.frc.tup.lciii.implementaciones.nafteros.MotorNaftero;
import ar.edu.utn.frc.tup.lciii.implementaciones.nafteros.RuedaNaftera;
import ar.edu.utn.frc.tup.lciii.interfaces.Carroceria;
import ar.edu.utn.frc.tup.lciii.interfaces.FabricaVehiculos;
import ar.edu.utn.frc.tup.lciii.interfaces.Motor;
import ar.edu.utn.frc.tup.lciii.interfaces.Ruedas;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void fabricaElectricos(){
        FabricaVehiculos fabricaElectricos = new FabricaCochesElectricos();

        Motor motorEsperado = fabricaElectricos.crearMotor();
        Carroceria carroceriaEsperada =  fabricaElectricos.crearCarroceria();
        Ruedas ruedaEsperada = fabricaElectricos.crearRuedas();

        assertInstanceOf(MotorElectrico.class, motorEsperado);
        assertInstanceOf(CarroceriaElectrica.class, carroceriaEsperada);
        assertInstanceOf(RuedaElectricas.class, ruedaEsperada);
    }
    @Test
    void fabricaNafteros(){
        FabricaVehiculos fabricaNafteros = new FabricaCochesNafteros();

        Motor motorEsperado = fabricaNafteros.crearMotor();
        Carroceria carroceriaEsperada =  fabricaNafteros.crearCarroceria();
        Ruedas ruedaEsperada = fabricaNafteros.crearRuedas();

        assertInstanceOf(MotorNaftero.class, motorEsperado);
        assertInstanceOf(CarroceriaNaftera.class, carroceriaEsperada);
        assertInstanceOf(RuedaNaftera.class, ruedaEsperada);
    }
    @Test
    void fabricaGasoleros(){
        FabricaVehiculos fabricaGasoleros = new FabricaCochesGasoleros();

        Motor motorEsperado = fabricaGasoleros.crearMotor();
        Carroceria carroceriaEsperada =  fabricaGasoleros.crearCarroceria();
        Ruedas ruedaEsperada = fabricaGasoleros.crearRuedas();

        assertInstanceOf(MotorGasolero.class, motorEsperado);
        assertInstanceOf(CarroceriaGasolera.class, carroceriaEsperada);
        assertInstanceOf(RuedaGasolera.class, ruedaEsperada);
    }
}