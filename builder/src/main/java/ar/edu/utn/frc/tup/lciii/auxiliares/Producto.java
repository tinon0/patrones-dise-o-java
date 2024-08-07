package ar.edu.utn.frc.tup.lciii.auxiliares;

import lombok.Getter;

@Getter
public class Producto {
    private String descripcion;
    private String color;
    private float peso;

    public Producto(String descripcion, String color, float peso) {
        this.descripcion = descripcion;
        this.color = color;
        this.peso = peso;
    }
}
