package ar.edu.utn.frc.tup.lciii;

public class ComandoPrepararRefresco implements Comando{
    private Receptor receptor;
    public ComandoPrepararRefresco(Receptor receptor){
        this.receptor = receptor;
    }
    @Override
    public String ejecutar() {
        return receptor.prepararRefresco();
    }
}
