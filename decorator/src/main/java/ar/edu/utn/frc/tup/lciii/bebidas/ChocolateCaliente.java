package ar.edu.utn.frc.tup.lciii.bebidas;

import ar.edu.utn.frc.tup.lciii.Bebida;

public class ChocolateCaliente implements Bebida {
    @Override
    public double costo() {
        return 2.0;
    }

    @Override
    public String descripcion() {
        return "Chocolate Caliente";
    }
}
