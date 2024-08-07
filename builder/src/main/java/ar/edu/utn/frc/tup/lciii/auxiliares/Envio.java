package ar.edu.utn.frc.tup.lciii.auxiliares;

import lombok.Getter;

@Getter
public class Envio {
    private String descripcion;

    public Envio(String descripcion) {
        this.descripcion = descripcion;
    }
}
