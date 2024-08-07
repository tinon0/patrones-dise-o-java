package ar.edu.utn.frc.tup.lciii.clasesConcretas;

import ar.edu.utn.frc.tup.lciii.interfaces.PlataformaDispositivo;

public class TelefonoInteligente implements PlataformaDispositivo {
    @Override
    public String encender() {
        return "Encendiendo Telefono inteligente";
    }

    @Override
    public String apagar() {
        return "Apagando en Telefono inteligente";
    }

    @Override
    public String subirVolumen() {
        return "Subiendo el volumen en Telefono inteligente";
    }

    @Override
    public String bajarVolumen() {
        return "Bajando el volumen en Telefono inteligente";
    }
}
