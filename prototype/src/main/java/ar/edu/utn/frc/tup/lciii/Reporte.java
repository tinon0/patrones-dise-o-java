package ar.edu.utn.frc.tup.lciii;

public class Reporte implements Documento{
    @Override
    public String clonar() {
        return "Clonando Reporte";
    }
    @Override
    public String anadir(String extra){
        return clonar() + " y agregando: " + extra;
    }
}
