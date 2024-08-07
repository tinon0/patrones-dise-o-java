package ar.edu.utn.frc.tup.lciii;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Invocador {
    @Getter
    private List<Comando> ordenesLista = new ArrayList<>();

    public void agregarOrden(Comando comando){
        this.ordenesLista.add(comando);
    }
    public void ejecutarOrdenes(){
        for (Comando comando : ordenesLista){
            comando.ejecutar();
        }
        this.ordenesLista.clear();
    }
}
