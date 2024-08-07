package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        Usuario a = new Usuario("Jorge", true);
        Usuario b = new Usuario("Julian", false);
        ProxyContenido proxy = new ProxyContenido();

        System.out.println(proxy.autorizacion(a));
        System.out.println(proxy.autorizacion(b));
    }
}
