package ar.edu.utn.frc.tup.lciii.clasesConcretas;

import ar.edu.utn.frc.tup.lciii.interfaces.PlataformaDispositivo;

public class TelevisorInteligente implements PlataformaDispositivo {
    @Override
    public String encender() {
        return "Encendiendo Televisor inteligente";
    }

    @Override
    public String apagar() {
        return "Apagando Televisor Inteligente";
    }

    @Override
    public String subirVolumen() {
        return "Subiendo el volumen en Televisor Inteligente";
    }

    @Override
    public String bajarVolumen() {
        return "Bajando el volumen en Televisor Inteligente";
    }
}
