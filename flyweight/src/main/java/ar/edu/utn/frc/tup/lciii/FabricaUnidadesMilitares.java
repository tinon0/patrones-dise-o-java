package ar.edu.utn.frc.tup.lciii;

import java.util.HashMap;
import java.util.Map;

public class FabricaUnidadesMilitares {
    private Map<String, UnidadMilitar> pool;
    public FabricaUnidadesMilitares() {
        this.pool = new HashMap<>();
    }
    public UnidadMilitar obtenerUnidad(String tipo) {
        if (pool.containsKey(tipo)) {
            return pool.get(tipo);
        } else {
            UnidadMilitar nuevaUnidad = new UnidadMilitarConcreta(tipo, 0, 0, 100);
            pool.put(tipo, nuevaUnidad);
            return nuevaUnidad;
        }
    }
}
