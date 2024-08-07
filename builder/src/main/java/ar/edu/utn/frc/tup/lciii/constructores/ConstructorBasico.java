package ar.edu.utn.frc.tup.lciii.constructores;

import ar.edu.utn.frc.tup.lciii.auxiliares.Cliente;
import ar.edu.utn.frc.tup.lciii.auxiliares.Envio;
import ar.edu.utn.frc.tup.lciii.auxiliares.Producto;

public class ConstructorBasico implements ConstructorOrden{

    @Override
    public Cliente construirCliente() {
        return new Cliente("Juan", "Cruz");
    }

    @Override
    public Producto construirProductos() {
        return new Producto("Coca-Cola", "rojo", 0.4f);
    }

    @Override
    public Envio construirEnvio() {
        return new Envio("Casa de Juan");
    }
}
