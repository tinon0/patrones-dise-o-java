package ar.edu.utn.frc.tup.lciii.decoradores;

import ar.edu.utn.frc.tup.lciii.Bebida;
import ar.edu.utn.frc.tup.lciii.DecoradorBebida;

public class Leche extends DecoradorBebida {
    public Leche(Bebida bebida) {
        super(bebida);
    }
    @Override
    public double costo(){
        return super.costo() + 0.3;
    }
    @Override
    public String descripcion(){
        return super.descripcion() + ", con Leche";
    }
}
