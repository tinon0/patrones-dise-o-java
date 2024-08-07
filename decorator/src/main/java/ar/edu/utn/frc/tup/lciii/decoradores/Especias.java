package ar.edu.utn.frc.tup.lciii.decoradores;

import ar.edu.utn.frc.tup.lciii.Bebida;
import ar.edu.utn.frc.tup.lciii.DecoradorBebida;

public class Especias extends DecoradorBebida {
    public Especias(Bebida bebida) {
        super(bebida);
    }
    @Override
    public double costo(){
        return super.costo() + 0.5;
    }
    @Override
    public String descripcion(){
        return super.descripcion() + ", con Especias";
    }
}
