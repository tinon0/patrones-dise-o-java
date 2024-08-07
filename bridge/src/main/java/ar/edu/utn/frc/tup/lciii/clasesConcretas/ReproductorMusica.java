package ar.edu.utn.frc.tup.lciii.clasesConcretas;

import ar.edu.utn.frc.tup.lciii.interfaces.ReproductorMultimedia;

public class ReproductorMusica implements ReproductorMultimedia {
    @Override
    public String reproducir() {
        return "Reproduciendo Musica";
    }

    @Override
    public String pausar() {
        return "Musica pausada";
    }

    @Override
    public String detener() {
        return "Musica detenida";
    }
}
