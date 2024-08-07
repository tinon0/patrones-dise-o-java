package ar.edu.utn.frc.tup.lciii.fabricas;

import ar.edu.utn.frc.tup.lciii.juguetes.Juguete;
import ar.edu.utn.frc.tup.lciii.juguetes.Muñeca;

public class FabricaMuñecas extends FabricaJuguetes{
    @Override
    public Juguete crearJuguete() {
        return new Muñeca();
    }
}
