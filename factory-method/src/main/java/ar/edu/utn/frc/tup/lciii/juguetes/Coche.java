package ar.edu.utn.frc.tup.lciii.juguetes;

public class Coche implements Juguete{
    @Override
    public String empaquetar() {
        return "Empaquetando Coche";
    }

    @Override
    public String etiquetar() {
        return "Etiquetando Coche";
    }

    @Override
    public String enviar() {
        return "Enviando Coche";
    }
}
