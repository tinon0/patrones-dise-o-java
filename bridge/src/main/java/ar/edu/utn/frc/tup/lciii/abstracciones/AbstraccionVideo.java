package ar.edu.utn.frc.tup.lciii.abstracciones;

import ar.edu.utn.frc.tup.lciii.interfaces.PlataformaDispositivo;
import ar.edu.utn.frc.tup.lciii.interfaces.ReproductorMultimedia;

public class AbstraccionVideo extends AbstraccionReproductor{
    public AbstraccionVideo(PlataformaDispositivo plataforma, ReproductorMultimedia reproductor) {
        super(plataforma, reproductor);
    }

    @Override
    public String encender() {
        return this.plataforma.encender();
    }

    @Override
    public String apagar() {
        return this.plataforma.apagar();
    }

    @Override
    public String subirVolumen() {
        return this.plataforma.subirVolumen();
    }

    @Override
    public String bajarVolumen() {
        return this.plataforma.bajarVolumen();
    }

    @Override
    public String reproducir() {
        return this.reproductor.reproducir();
    }

    @Override
    public String pausar() {
        return this.reproductor.pausar();
    }

    @Override
    public String detener() {
        return this.reproductor.detener();
    }
}
