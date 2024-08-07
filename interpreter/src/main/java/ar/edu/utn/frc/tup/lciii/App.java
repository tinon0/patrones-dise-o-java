package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        Expresion aux = new Parser().parser("2 2 +");
        System.out.println(aux.toString());
    }
}
