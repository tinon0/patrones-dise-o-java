package ar.edu.utn.frc.tup.lciii.auxiliares;

import lombok.Getter;

@Getter
public class Cliente {
    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
