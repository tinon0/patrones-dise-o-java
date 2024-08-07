package ar.edu.utn.frc.tup.lciii.decoradores;

import ar.edu.utn.frc.tup.lciii.Bebida;
import ar.edu.utn.frc.tup.lciii.DecoradorBebida;

public class Jarabe extends DecoradorBebida {
    public Jarabe(Bebida bebida) {
        super(bebida);
    }
    @Override
    public double costo(){
        return super.costo() + 1.0;
    }
    @Override
    public String descripcion(){
        return super.descripcion() + ", con Jarabe";
    }
}
