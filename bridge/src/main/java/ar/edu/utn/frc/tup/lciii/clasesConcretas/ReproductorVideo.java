package ar.edu.utn.frc.tup.lciii.clasesConcretas;

import ar.edu.utn.frc.tup.lciii.interfaces.ReproductorMultimedia;

public class ReproductorVideo implements ReproductorMultimedia {
    @Override
    public String reproducir() {
        return "Reproduciendo Video";
    }

    @Override
    public String pausar() {
        return "Video pausado";
    }

    @Override
    public String detener() {
        return "Video detenido";
    }
}
