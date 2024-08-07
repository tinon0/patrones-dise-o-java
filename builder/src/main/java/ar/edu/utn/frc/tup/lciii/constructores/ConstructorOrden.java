package ar.edu.utn.frc.tup.lciii.constructores;

import ar.edu.utn.frc.tup.lciii.auxiliares.Cliente;
import ar.edu.utn.frc.tup.lciii.auxiliares.Envio;
import ar.edu.utn.frc.tup.lciii.auxiliares.Producto;

public interface ConstructorOrden {
    Cliente construirCliente();
    Producto construirProductos();
    Envio construirEnvio();
}
