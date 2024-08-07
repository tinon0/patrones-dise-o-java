package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void main(){
        Producto producto = new Producto("Galletas", 2, 0.4f);
        SujetoNotificador notificador = new SujetoNotificador();
        Gerente gerente = new Gerente("Juan");
        PersonalAlmacen personal = new PersonalAlmacen("Javier");

        notificador.anadirOberver(gerente);
        producto.setPeso(1.0f);
        assertEquals("Gerente Juan ha cambiado el producto Galletas. Stock: 2|Peso: 1.0\n", notificador.notificarOberver(producto));

        notificador.quitarOberver(gerente);
        assertTrue(notificador.getObservadores().isEmpty());

        producto.setCantStock(1);
        notificador.anadirOberver(personal);
        assertEquals("Personal de Almacen Javier ha cambiado el producto Galletas. Stock: 1|Peso: 1.0\n", notificador.notificarOberver(producto));
    }
}