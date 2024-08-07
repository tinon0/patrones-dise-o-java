package ar.edu.utn.frc.tup.lciii.clasesConcretas;

import ar.edu.utn.frc.tup.lciii.interfaces.ReproductorMultimedia;

public class ReproductorJuego implements ReproductorMultimedia {
    @Override
    public String reproducir() {
        return "Reproduciendo Juego";
    }

    @Override
    public String pausar() {
        return "Juego pausado";
    }

    @Override
    public String detener() {
        return "Juego detenido";
    }
}
