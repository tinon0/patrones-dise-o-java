package ar.edu.utn.frc.tup.lciii;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class SujetoNotificador {
    private List<Observador> observadores = new ArrayList<>();
    public void anadirOberver(Observador obs){
        observadores.add(obs);
    }
    public void quitarOberver(Observador obs){
        observadores.remove(obs);
    }
    public String notificarOberver(Producto prod){
        String resultado = "";
        for (Observador obs : observadores){
            resultado += obs.actualizar(prod.getNombre(), prod.getCantStock(), prod.getPeso()) + "\n";
        }
        return resultado;
    }

}
