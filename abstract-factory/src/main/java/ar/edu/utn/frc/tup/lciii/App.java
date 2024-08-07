package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.interfaces.FabricaVehiculos;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        FabricaVehiculos fabricaElectricos = new FabricaCochesElectricos();
        FabricaVehiculos fabricaNafteros = new FabricaCochesNafteros();
        FabricaVehiculos fabricaGasoleros = new FabricaCochesGasoleros();

        fabricaElectricos.crearMotor();
        fabricaElectricos.crearCarroceria();
        fabricaElectricos.crearRuedas();

        System.out.println();

        fabricaNafteros.crearMotor();
        fabricaNafteros.crearCarroceria();
        fabricaNafteros.crearRuedas();

        System.out.println();

        fabricaGasoleros.crearMotor();
        fabricaGasoleros.crearCarroceria();
        fabricaGasoleros.crearRuedas();
    }
}
