package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        Selector selector = new Selector(scan);
        System.out.println("BIENVENIDO AL SISTEMA DE SELECTOR DE ANALISIS");
        System.out.println("ELIJA UN DOCUMENTO");
        System.out.println("1- DOCUMENTO DE TEXTO");
        System.out.println("2- HOJA DE CALCULO");
        System.out.println("3- PRESENTACION");
        int opcion = scan.nextInt();
        String resultado = selector.selectorDocumento(opcion);
        System.out.println(resultado);
    }
}
