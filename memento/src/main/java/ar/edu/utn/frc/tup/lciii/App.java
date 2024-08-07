package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Memento Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        Editor editor = new Editor();

        editor.escribir("Hola");
        editor.escribir("Hola como");
        editor.escribir("Hola como estas");
        editor.escribir("Hola como estas vecino?");

        editor.deshacer();
        System.out.println(editor.mostrar());
    }
}
