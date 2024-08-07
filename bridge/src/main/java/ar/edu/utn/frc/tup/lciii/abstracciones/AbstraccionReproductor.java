package ar.edu.utn.frc.tup.lciii.abstracciones;

import ar.edu.utn.frc.tup.lciii.interfaces.PlataformaDispositivo;
import ar.edu.utn.frc.tup.lciii.interfaces.ReproductorMultimedia;

public abstract class AbstraccionReproductor {
    protected PlataformaDispositivo plataforma;
    protected ReproductorMultimedia reproductor;
    public AbstraccionReproductor(PlataformaDispositivo plataforma, ReproductorMultimedia reproductor){
        this.plataforma = plataforma;
        this.reproductor = reproductor;
    }
    public abstract String encender();
    public abstract String apagar();
    public abstract String subirVolumen();
    public abstract String bajarVolumen();
    public abstract String reproducir();
    public abstract String pausar();
    public abstract String detener();
}
