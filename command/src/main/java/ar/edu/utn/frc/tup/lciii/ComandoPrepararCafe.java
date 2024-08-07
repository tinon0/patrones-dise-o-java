package ar.edu.utn.frc.tup.lciii;

public class ComandoPrepararCafe implements Comando{
    private Receptor receptor;
    public ComandoPrepararCafe(Receptor receptor){
        this.receptor = receptor;
    }

    @Override
    public String ejecutar() {
        return receptor.prepararCafe();
    }
}
