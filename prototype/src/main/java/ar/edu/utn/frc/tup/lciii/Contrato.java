package ar.edu.utn.frc.tup.lciii;

public class Contrato implements Documento{
    @Override
    public String clonar() {
        return "Clonando Contrato";
    }
    @Override
    public String anadir(String extra){
        return clonar() + " y agregando: " + extra;
    }
}
