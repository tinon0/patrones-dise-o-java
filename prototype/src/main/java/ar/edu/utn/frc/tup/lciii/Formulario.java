package ar.edu.utn.frc.tup.lciii;

public class Formulario implements Documento{
    @Override
    public String clonar() {
        return "Clonando Formulario";
    }
    @Override
    public String anadir(String extra){
        return clonar() + " y agregando: " + extra;
    }
}
