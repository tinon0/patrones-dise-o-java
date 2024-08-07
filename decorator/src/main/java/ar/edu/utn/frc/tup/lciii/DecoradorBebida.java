package ar.edu.utn.frc.tup.lciii;

public abstract class DecoradorBebida implements Bebida{
    private Bebida bebida;
    public DecoradorBebida(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public double costo() {
        return bebida.costo();
    }

    @Override
    public String descripcion() {
        return bebida.descripcion();
    }
}
