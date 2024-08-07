package ar.edu.utn.frc.tup.lciii.decoradores;

import ar.edu.utn.frc.tup.lciii.Bebida;
import ar.edu.utn.frc.tup.lciii.DecoradorBebida;

public class Azucar extends DecoradorBebida {
    public Azucar(Bebida bebida) {
        super(bebida);
    }
    @Override
    public double costo(){
        return super.costo() + 0.3;
    }
    @Override
    public String descripcion(){
        return super.descripcion() + ", con Azucar";
    }
}
