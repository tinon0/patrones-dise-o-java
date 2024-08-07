package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void main(){
        FabricaUnidadesMilitares fabrica = new FabricaUnidadesMilitares();

        UnidadMilitar soldado1 = fabrica.obtenerUnidad("Soldado");
        UnidadMilitar soldado2 = fabrica.obtenerUnidad("Soldado");
        UnidadMilitar arquero = fabrica.obtenerUnidad("Arquero");

        assertEquals(soldado2, soldado1);
        assertNotEquals(soldado1, arquero);
    }
    @Test
    void tropas(){
        FabricaUnidadesMilitares fabrica = new FabricaUnidadesMilitares();

        UnidadMilitar soldado1 = fabrica.obtenerUnidad("Soldado");
        UnidadMilitar soldado2 = fabrica.obtenerUnidad("Soldado");
        UnidadMilitar arquero = fabrica.obtenerUnidad("Arquero");

        String respuestaSoldado = "Soldado atacó al enemigo", respuestaArquero = "Arquero atacó al enemigo";
        assertEquals(respuestaSoldado, soldado1.atacar());
        assertEquals(respuestaArquero, arquero.atacar());

        String respuestaSoldado2 = "Soldado se puso en defensiva", respuestaArquero2 = "Arquero se puso en defensiva";
        assertEquals(respuestaSoldado2, soldado1.defender());
        assertEquals(respuestaArquero2, arquero.defender());
    }
}