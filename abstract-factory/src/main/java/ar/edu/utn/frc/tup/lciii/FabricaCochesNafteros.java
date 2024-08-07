package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.implementaciones.nafteros.CarroceriaNaftera;
import ar.edu.utn.frc.tup.lciii.implementaciones.nafteros.MotorNaftero;
import ar.edu.utn.frc.tup.lciii.implementaciones.nafteros.RuedaNaftera;
import ar.edu.utn.frc.tup.lciii.interfaces.Carroceria;
import ar.edu.utn.frc.tup.lciii.interfaces.FabricaVehiculos;
import ar.edu.utn.frc.tup.lciii.interfaces.Motor;
import ar.edu.utn.frc.tup.lciii.interfaces.Ruedas;

public class FabricaCochesNafteros implements FabricaVehiculos {
    @Override
    public Motor crearMotor() {
        System.out.println("Se creo un motor naftero!");
        return new MotorNaftero();
    }

    @Override
    public Ruedas crearRuedas() {
        System.out.println("Se crearon ruedas nafteras!");
        return new RuedaNaftera();
    }

    @Override
    public Carroceria crearCarroceria() {
        System.out.println("Se creo la carroceria naftera!");
        return new CarroceriaNaftera();
    }
}
