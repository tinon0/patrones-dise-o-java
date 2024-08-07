package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.constructores.ConstructorBasico;
import ar.edu.utn.frc.tup.lciii.constructores.ConstructorOrden;
import ar.edu.utn.frc.tup.lciii.constructores.ConstructorPersonalizado;
import ar.edu.utn.frc.tup.lciii.constructores.ConstructorPremium;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void ordenBasica(){
        ConstructorOrden constructorBas = new ConstructorBasico();
        OrdenCompra orden = new OrdenCompra(constructorBas.construirCliente(), constructorBas.construirEnvio(), constructorBas.construirProductos());
        assertAll(  () -> assertEquals("Juan", orden.getCliente().getNombre()),
                    () -> assertEquals("Cruz", orden.getCliente().getApellido()),
                    () -> assertEquals("Casa de Juan", orden.getEnvio().getDescripcion()),
                    () -> assertEquals("Coca-Cola", orden.getProducto().getDescripcion()),
                    () -> assertEquals("rojo", orden.getProducto().getColor()),
                    () -> assertEquals(0.4f, orden.getProducto().getPeso()));
    }
    @Test
    void ordenPremium(){
        ConstructorOrden constructorPrem = new ConstructorPremium();
        OrdenCompra orden2 = new OrdenCompra(constructorPrem.construirCliente(), constructorPrem.construirEnvio(), constructorPrem.construirProductos());
        assertAll(  () -> assertEquals("John", orden2.getCliente().getNombre()),
                () -> assertEquals("Wick", orden2.getCliente().getApellido()),
                () -> assertEquals("Continental de New York", orden2.getEnvio().getDescripcion()),
                () -> assertEquals("Revolver Magnum", orden2.getProducto().getDescripcion()),
                () -> assertEquals("gris", orden2.getProducto().getColor()),
                () -> assertEquals(2.3f, orden2.getProducto().getPeso()));
    }
    @Test
    void ordenPersonalizada(){
        ConstructorOrden constructorPer = new ConstructorPersonalizado("Lucas", "Olmedo", "Pelota", "negra", 0.3f, "Bombonera");
        OrdenCompra orden3 = new OrdenCompra(constructorPer.construirCliente(), constructorPer.construirEnvio(), constructorPer.construirProductos());
        assertAll(  () -> assertEquals("Lucas", orden3.getCliente().getNombre()),
                () -> assertEquals("Olmedo", orden3.getCliente().getApellido()),
                () -> assertEquals("Bombonera", orden3.getEnvio().getDescripcion()),
                () -> assertEquals("Pelota", orden3.getProducto().getDescripcion()),
                () -> assertEquals("negra", orden3.getProducto().getColor()),
                () -> assertEquals(0.3f, orden3.getProducto().getPeso()));
    }
}