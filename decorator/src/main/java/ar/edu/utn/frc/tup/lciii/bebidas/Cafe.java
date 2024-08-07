package ar.edu.utn.frc.tup.lciii.bebidas;

import ar.edu.utn.frc.tup.lciii.Bebida;

public class Cafe implements Bebida {
    @Override
    public double costo() {
        return 3.5;
    }

    @Override
    public String descripcion() {
        return "Cafe";
    }
}
