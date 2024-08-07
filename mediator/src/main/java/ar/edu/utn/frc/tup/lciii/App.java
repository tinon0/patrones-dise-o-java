package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        SalaChat sala = new SalaChat();

        Usuario usuario1 = new Usuario("Horacio");
        Usuario usuario2 = new Usuario("Luciano");
        Usuario usuario3 = new Usuario("Matias");

        sala.registrarUsuario(usuario1);
        sala.registrarUsuario(usuario2);
        sala.registrarUsuario(usuario3);

        usuario1.enviarMensaje("Hola Mundo");
        usuario2.recibirMensaje("Hola Mundo");

    }
}
