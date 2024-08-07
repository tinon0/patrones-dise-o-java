package ar.edu.utn.frc.tup.lciii;


import ar.edu.utn.frc.tup.lciii.bebidas.Cafe;
import ar.edu.utn.frc.tup.lciii.decoradores.Azucar;
import ar.edu.utn.frc.tup.lciii.decoradores.Leche;

/**
 * Decorator Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        Bebida bebida = new Cafe();

        bebida = new Leche(bebida);
        bebida = new Azucar(bebida);

        System.out.println("Lo que pidio: "+bebida.descripcion()+" |Precio: $"+bebida.costo());
    }
}
