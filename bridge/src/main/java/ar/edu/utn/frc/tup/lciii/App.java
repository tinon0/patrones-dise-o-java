package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.abstracciones.AbstraccionJuegos;
import ar.edu.utn.frc.tup.lciii.abstracciones.AbstraccionMusica;
import ar.edu.utn.frc.tup.lciii.abstracciones.AbstraccionReproductor;
import ar.edu.utn.frc.tup.lciii.clasesConcretas.ReproductorJuego;
import ar.edu.utn.frc.tup.lciii.clasesConcretas.ReproductorMusica;
import ar.edu.utn.frc.tup.lciii.clasesConcretas.TelefonoInteligente;
import ar.edu.utn.frc.tup.lciii.clasesConcretas.TelevisorInteligente;
import ar.edu.utn.frc.tup.lciii.interfaces.PlataformaDispositivo;
import ar.edu.utn.frc.tup.lciii.interfaces.ReproductorMultimedia;

/**
 * Bridge Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        PlataformaDispositivo telefono = new TelefonoInteligente();
        ReproductorMultimedia musica = new ReproductorMusica();

        AbstraccionReproductor reproductorMusica = new AbstraccionMusica(telefono, musica);

        System.out.println(reproductorMusica.encender());
        System.out.println(reproductorMusica.reproducir());
        System.out.println(reproductorMusica.subirVolumen());
        System.out.println(reproductorMusica.bajarVolumen());
        System.out.println(reproductorMusica.pausar());
        System.out.println(reproductorMusica.detener());
        System.out.println(reproductorMusica.apagar());

        PlataformaDispositivo televisor = new TelevisorInteligente();
        ReproductorMultimedia juego = new ReproductorJuego();

        AbstraccionReproductor videojuego = new AbstraccionJuegos(televisor, juego);

        System.out.println(videojuego.encender());
        System.out.println(videojuego.reproducir());
        System.out.println(videojuego.subirVolumen());
        System.out.println(videojuego.bajarVolumen());
        System.out.println(videojuego.pausar());
        System.out.println(videojuego.detener());
        System.out.println(videojuego.apagar());
    }
}
