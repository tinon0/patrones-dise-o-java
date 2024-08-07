package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.implementaciones.electricos.CarroceriaElectrica;
import ar.edu.utn.frc.tup.lciii.implementaciones.electricos.MotorElectrico;
import ar.edu.utn.frc.tup.lciii.implementaciones.electricos.RuedaElectricas;
import ar.edu.utn.frc.tup.lciii.interfaces.Carroceria;
import ar.edu.utn.frc.tup.lciii.interfaces.FabricaVehiculos;
import ar.edu.utn.frc.tup.lciii.interfaces.Motor;
import ar.edu.utn.frc.tup.lciii.interfaces.Ruedas;

public class FabricaCochesElectricos implements FabricaVehiculos {
    @Override
    public Motor crearMotor() {
        System.out.println("Se creo un motor electrico!");
        return new MotorElectrico();
    }

    @Override
    public Ruedas crearRuedas() {
        System.out.println("Se crearon ruedas electricas!");
        return new RuedaElectricas();
    }

    @Override
    public Carroceria crearCarroceria() {
        System.out.println("Se creo la carroceria electrico!");
        return new CarroceriaElectrica();
    }
}
