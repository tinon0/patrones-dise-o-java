package ar.edu.utn.frc.tup.lciii.interfaces;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public interface FabricaVehiculos {
    abstract Motor crearMotor();
    abstract Ruedas crearRuedas();
    abstract Carroceria crearCarroceria();
}
