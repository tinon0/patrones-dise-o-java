package ar.edu.utn.frc.tup.lciii.constructores;

import ar.edu.utn.frc.tup.lciii.auxiliares.Cliente;
import ar.edu.utn.frc.tup.lciii.auxiliares.Envio;
import ar.edu.utn.frc.tup.lciii.auxiliares.Producto;

public class ConstructorPremium implements ConstructorOrden{

    @Override
    public Cliente construirCliente() {
        return new Cliente("John", "Wick");
    }

    @Override
    public Producto construirProductos() {
        return new Producto("Revolver Magnum", "gris", 2.3f);
    }

    @Override
    public Envio construirEnvio() {
        return new Envio("Continental de New York");
    }
}
