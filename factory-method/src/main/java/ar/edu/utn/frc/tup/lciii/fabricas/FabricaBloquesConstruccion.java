package ar.edu.utn.frc.tup.lciii.fabricas;

import ar.edu.utn.frc.tup.lciii.juguetes.*;

public class FabricaBloquesConstruccion extends FabricaJuguetes{
    @Override
    public Juguete crearJuguete() {
        return new BloqueConstruccion();
    }
}
