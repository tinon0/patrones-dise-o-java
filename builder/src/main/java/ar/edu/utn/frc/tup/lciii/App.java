package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.constructores.ConstructorBasico;
import ar.edu.utn.frc.tup.lciii.constructores.ConstructorOrden;
import ar.edu.utn.frc.tup.lciii.constructores.ConstructorPersonalizado;
import ar.edu.utn.frc.tup.lciii.constructores.ConstructorPremium;

import java.util.Scanner;

/**
 * Builder Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        ConstructorOrden constructorBas = new ConstructorBasico();
        OrdenCompra orden = new OrdenCompra(constructorBas.construirCliente(), constructorBas.construirEnvio(), constructorBas.construirProductos());
        System.out.println("Orden de: " + orden.getCliente().getNombre() + " donde pide: " + orden.getProducto().getDescripcion() + " para enviar a: " + orden.getEnvio().getDescripcion());
        System.out.println();

        ConstructorOrden constructorPrem = new ConstructorPremium();
        OrdenCompra orden2 = new OrdenCompra(constructorPrem.construirCliente(), constructorPrem.construirEnvio(), constructorPrem.construirProductos());
        System.out.println("Orden de: " + orden2.getCliente().getNombre() + " donde pide: " + orden2.getProducto().getDescripcion() + " para enviar a: " + orden2.getEnvio().getDescripcion());
        System.out.println();

        ConstructorOrden constructorPers = new ConstructorPersonalizado("Valentino", "Freeman", "Pistola Antigravedad", "naranja", 1.5f, "White Forest");
        OrdenCompra orden3 = new OrdenCompra(constructorPers.construirCliente(), constructorPers.construirEnvio(), constructorPers.construirProductos());
        System.out.println("Orden de: " + orden3.getCliente().getNombre() + " donde pide: " + orden3.getProducto().getDescripcion() + " para enviar a: " + orden3.getEnvio().getDescripcion());
    }
}
