package ar.edu.utn.frc.tup.lciii.decoradores;

import ar.edu.utn.frc.tup.lciii.Bebida;
import ar.edu.utn.frc.tup.lciii.DecoradorBebida;

public class Crema extends DecoradorBebida {
    public Crema(Bebida bebida) {
        super(bebida);
    }
    @Override
    public double costo(){
        return super.costo() + 0.7;
    }
    @Override
    public String descripcion(){
        return super.descripcion() + ", con Crema";
    }
}
