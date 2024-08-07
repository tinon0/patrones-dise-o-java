package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.auxiliares.Cliente;
import ar.edu.utn.frc.tup.lciii.auxiliares.Envio;
import ar.edu.utn.frc.tup.lciii.auxiliares.Producto;
import lombok.Getter;

@Getter
public class OrdenCompra {
    private Cliente cliente;
    private Envio envio;
    private Producto producto;

    public OrdenCompra(Cliente cliente, Envio envio, Producto producto) {
        this.cliente = cliente;
        this.envio = envio;
        this.producto = producto;
    }
}
