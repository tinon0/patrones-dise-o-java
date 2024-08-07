package ar.edu.utn.frc.tup.lciii.juguetes;

public class Muñeca implements Juguete{
    @Override
    public String empaquetar() {
        return "Empaquetando Muñeca";
    }

    @Override
    public String etiquetar() {
        return "Etiquetando Muñeca";
    }

    @Override
    public String enviar() {
        return "Enviando Muñeca";
    }
}
