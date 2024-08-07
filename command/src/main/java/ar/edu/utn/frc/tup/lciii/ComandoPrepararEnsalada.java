package ar.edu.utn.frc.tup.lciii;

public class ComandoPrepararEnsalada implements Comando{
    private Receptor receptor;
    public ComandoPrepararEnsalada(Receptor receptor){
        this.receptor = receptor;
    }

    @Override
    public String ejecutar() {
        return receptor.prepararEnsalada();
    }
}
