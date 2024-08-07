package ar.edu.utn.frc.tup.lciii.juguetes;

public class Peluche implements Juguete{
    @Override
    public String empaquetar() {
        return "Empaquetando Peluche";
    }

    @Override
    public String etiquetar() {
        return "Etiquetando Peluche";
    }

    @Override
    public String enviar() {
        return "Enviando Peluche";
    }
}
