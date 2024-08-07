package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.implementaciones.gasoleros.CarroceriaGasolera;
import ar.edu.utn.frc.tup.lciii.implementaciones.gasoleros.MotorGasolero;
import ar.edu.utn.frc.tup.lciii.implementaciones.gasoleros.RuedaGasolera;
import ar.edu.utn.frc.tup.lciii.interfaces.Carroceria;
import ar.edu.utn.frc.tup.lciii.interfaces.FabricaVehiculos;
import ar.edu.utn.frc.tup.lciii.interfaces.Motor;
import ar.edu.utn.frc.tup.lciii.interfaces.Ruedas;

public class FabricaCochesGasoleros implements FabricaVehiculos {
    @Override
    public Motor crearMotor() {
        System.out.println("Se creo un motor gasolero!");
        return new MotorGasolero();
    }

    @Override
    public Ruedas crearRuedas() {
        System.out.println("Se crearon ruedas gasoleras!");
        return new RuedaGasolera();
    }

    @Override
    public Carroceria crearCarroceria() {
        System.out.println("Se creo la carroceria gasolera!");
        return new CarroceriaGasolera();
    }
}
