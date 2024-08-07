package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.abstracciones.AbstraccionJuegos;
import ar.edu.utn.frc.tup.lciii.abstracciones.AbstraccionMusica;
import ar.edu.utn.frc.tup.lciii.abstracciones.AbstraccionReproductor;
import ar.edu.utn.frc.tup.lciii.abstracciones.AbstraccionVideo;
import ar.edu.utn.frc.tup.lciii.clasesConcretas.*;
import ar.edu.utn.frc.tup.lciii.interfaces.PlataformaDispositivo;
import ar.edu.utn.frc.tup.lciii.interfaces.ReproductorMultimedia;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void telefonoMusica(){
        PlataformaDispositivo telefono = new TelefonoInteligente();
        ReproductorMultimedia musica = new ReproductorMusica();

        AbstraccionReproductor reproductorMusica = new AbstraccionMusica(telefono, musica);
        String resultado =  reproductorMusica.encender() + System.lineSeparator() +
                            reproductorMusica.reproducir() + System.lineSeparator() +
                            reproductorMusica.subirVolumen() + System.lineSeparator() +
                            reproductorMusica.bajarVolumen() + System.lineSeparator() +
                            reproductorMusica.pausar() + System.lineSeparator() +
                            reproductorMusica.detener() + System.lineSeparator() +
                            reproductorMusica.apagar();
        assertEquals(   "Encendiendo Telefono inteligente" + System.lineSeparator() +
                                "Reproduciendo Musica" + System.lineSeparator() +
                                "Subiendo el volumen en Telefono inteligente" + System.lineSeparator() +
                                "Bajando el volumen en Telefono inteligente" + System.lineSeparator() +
                                "Musica pausada" + System.lineSeparator() +
                                "Musica detenida" + System.lineSeparator() +
                                "Apagando en Telefono inteligente", resultado);
    }
    @Test
    void televisorJuego(){
        PlataformaDispositivo televisor = new TelevisorInteligente();
        ReproductorMultimedia juego = new ReproductorJuego();

        AbstraccionReproductor videojuego = new AbstraccionJuegos(televisor, juego);

        AbstraccionReproductor reproductorJuego = new AbstraccionMusica(televisor, juego);
        String resultado =  reproductorJuego.encender() + System.lineSeparator() +
                reproductorJuego.reproducir() + System.lineSeparator() +
                reproductorJuego.subirVolumen() + System.lineSeparator() +
                reproductorJuego.bajarVolumen() + System.lineSeparator() +
                reproductorJuego.pausar() + System.lineSeparator() +
                reproductorJuego.detener() + System.lineSeparator() +
                reproductorJuego.apagar();
        assertEquals(   "Encendiendo Televisor inteligente" + System.lineSeparator() +
                "Reproduciendo Juego" + System.lineSeparator() +
                "Subiendo el volumen en Televisor Inteligente" + System.lineSeparator() +
                "Bajando el volumen en Televisor Inteligente" + System.lineSeparator() +
                "Juego pausado" + System.lineSeparator() +
                "Juego detenido" + System.lineSeparator() +
                "Apagando Televisor Inteligente", resultado);
    }
    @Test
    void tabletVideo(){
        PlataformaDispositivo tablet = new Tableta();
        ReproductorMultimedia video = new ReproductorVideo();

        AbstraccionReproductor reproductorVideo = new AbstraccionVideo(tablet, video);
        String resultado =  reproductorVideo.encender() + System.lineSeparator() +
                reproductorVideo.reproducir() + System.lineSeparator() +
                reproductorVideo.subirVolumen() + System.lineSeparator() +
                reproductorVideo.bajarVolumen() + System.lineSeparator() +
                reproductorVideo.pausar() + System.lineSeparator() +
                reproductorVideo.detener() + System.lineSeparator() +
                reproductorVideo.apagar();
        assertEquals(   "Encendiendo Tableta" + System.lineSeparator() +
                "Reproduciendo Video" + System.lineSeparator() +
                "Subiendo el volumen en Tableta" + System.lineSeparator() +
                "Bajando el volumen en Tableta" + System.lineSeparator() +
                "Video pausado" + System.lineSeparator() +
                "Video detenido" + System.lineSeparator() +
                "Apagando en Tableta", resultado);
    }
}