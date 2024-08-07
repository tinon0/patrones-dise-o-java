package ar.edu.utn.frc.tup.lciii.juguetes;

public class BloqueConstruccion implements Juguete{
    @Override
    public String empaquetar() {
        return "Empaquetando Bloque de Construccion";
    }

    @Override
    public String etiquetar() {
        return "Etiquetando Bloque de Construccion";
    }

    @Override
    public String enviar() {
        return "Enviando Bloque de Construccion";
    }
}
