package ar.edu.utn.frc.tup.lciii;

public class ComandoPrepararPizza implements Comando{
    private Receptor receptor;
    public ComandoPrepararPizza(Receptor receptor){
        this.receptor = receptor;
    }

    @Override
    public String ejecutar() {
        return receptor.prepararPizza();
    }
}
