package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Template Method Pattern
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        BebidaSelector selector = new BebidaSelector();
        System.out.println("ELIJA SU BEBIDA");
        System.out.println("1- CAFE");
        System.out.println("2- TE");
        System.out.println("3- CHOCOLATE CALIENTE");
        int opcion = scan.nextInt();
        selector.seleccionarOpcion(opcion);
    }
}
