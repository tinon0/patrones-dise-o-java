package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.fabricas.*;
import ar.edu.utn.frc.tup.lciii.juguetes.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void main(){
        FabricaJuguetes fabricaCoches = new FabricaCoches();
        FabricaJuguetes fabricaPeluches = new FabricaPeluches();
        FabricaJuguetes fabricaMunecas = new FabricaMuñecas();
        FabricaJuguetes fabricaBloques = new FabricaBloquesConstruccion();

        Juguete coche = fabricaCoches.crearJuguete();
        Juguete peluche = fabricaPeluches.crearJuguete();
        Juguete bloque = fabricaBloques.crearJuguete();
        Juguete muneca = fabricaMunecas.crearJuguete();

        assertInstanceOf(Coche.class, coche);
        assertInstanceOf(Peluche.class, peluche);
        assertInstanceOf(BloqueConstruccion.class, bloque);
        assertInstanceOf(Muñeca.class, muneca);

        String respuestaCoche = "Empaquetando Coche", respuestaPeluche = "Empaquetando Peluche", respuestaBloque = "Empaquetando Bloque de Construccion", respuestaMuneca = "Empaquetando Muñeca";
        assertEquals(respuestaCoche, ((Coche)coche).empaquetar());
        assertEquals(respuestaPeluche, ((Peluche)peluche).empaquetar());
        assertEquals(respuestaBloque, ((BloqueConstruccion)bloque).empaquetar());
        assertEquals(respuestaMuneca, ((Muñeca)muneca).empaquetar());

        String respuestaCoche2 = "Etiquetando Coche", respuestaPeluche2 = "Etiquetando Peluche", respuestaBloque2 = "Etiquetando Bloque de Construccion", respuestaMuneca2 = "Etiquetando Muñeca";
        assertEquals(respuestaCoche2, ((Coche)coche).etiquetar());
        assertEquals(respuestaPeluche2, ((Peluche)peluche).etiquetar());
        assertEquals(respuestaBloque2, ((BloqueConstruccion)bloque).etiquetar());
        assertEquals(respuestaMuneca2, ((Muñeca)muneca).etiquetar());

        String respuestaCoche3 = "Enviando Coche", respuestaPeluche3 = "Enviando Peluche", respuestaBloque3 = "Enviando Bloque de Construccion", respuestaMuneca3 = "Enviando Muñeca";
        assertEquals(respuestaCoche3, ((Coche)coche).enviar());
        assertEquals(respuestaPeluche3, ((Peluche)peluche).enviar());
        assertEquals(respuestaBloque3, ((BloqueConstruccion)bloque).enviar());
        assertEquals(respuestaMuneca3, ((Muñeca)muneca).enviar());
    }
}