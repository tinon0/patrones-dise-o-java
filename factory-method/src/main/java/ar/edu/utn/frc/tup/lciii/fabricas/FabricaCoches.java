package ar.edu.utn.frc.tup.lciii.fabricas;

import ar.edu.utn.frc.tup.lciii.juguetes.*;

public class FabricaCoches extends FabricaJuguetes {
    @Override
    public Juguete crearJuguete() {
        return new Coche();
    }
}
