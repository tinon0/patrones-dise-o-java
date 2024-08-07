package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        FabricaUnidadesMilitares fabrica = new FabricaUnidadesMilitares();

        UnidadMilitar soldado1 = fabrica.obtenerUnidad("Soldado");
        UnidadMilitar soldado2 = fabrica.obtenerUnidad("Soldado");
        UnidadMilitar arquero = fabrica.obtenerUnidad("Arquero");

        System.out.println(soldado2 == soldado1 ? "Son lo mismo":"No son lo mismo");
        System.out.println(soldado1 == arquero ? "Son lo mismo":"No son lo mismo");
    }
}
