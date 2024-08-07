package ar.edu.utn.frc.tup.lciii.constructores;

import ar.edu.utn.frc.tup.lciii.auxiliares.Cliente;
import ar.edu.utn.frc.tup.lciii.auxiliares.Envio;
import ar.edu.utn.frc.tup.lciii.auxiliares.Producto;

public class ConstructorPersonalizado implements ConstructorOrden{
    private String nomCliente;
    private String apeCliente;
    private String descProd;
    private String color;
    private float peso;
    private String envio;

    public ConstructorPersonalizado(String nomCliente, String apeCliente, String descProd, String color, float peso, String envio) {
        this.nomCliente = nomCliente;
        this.apeCliente = apeCliente;
        this.descProd = descProd;
        this.color = color;
        this.peso = peso;
        this.envio = envio;
    }

    @Override
    public Cliente construirCliente() {
        return new Cliente(this.nomCliente, this.apeCliente);
    }

    @Override
    public Producto construirProductos() {
        return new Producto(this.descProd, this.color, this.peso);
    }

    @Override
    public Envio construirEnvio() {
        return new Envio(this.envio);
    }
}
