package ar.edu.utn.frc.tup.lciii.bebidas;

import ar.edu.utn.frc.tup.lciii.Bebida;

public class Te implements Bebida {
    @Override
    public double costo() {
        return 1.5;
    }

    @Override
    public String descripcion() {
        return "Te";
    }
}
