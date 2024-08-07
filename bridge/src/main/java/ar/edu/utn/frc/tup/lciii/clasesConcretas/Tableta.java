package ar.edu.utn.frc.tup.lciii.clasesConcretas;

import ar.edu.utn.frc.tup.lciii.interfaces.PlataformaDispositivo;

public class Tableta implements PlataformaDispositivo {
    @Override
    public String encender() {
        return "Encendiendo Tableta";
    }

    @Override
    public String apagar() {
        return "Apagando en Tableta";
    }

    @Override
    public String subirVolumen() {
        return "Subiendo el volumen en Tableta";
    }

    @Override
    public String bajarVolumen() {
        return "Bajando el volumen en Tableta";
    }
}
