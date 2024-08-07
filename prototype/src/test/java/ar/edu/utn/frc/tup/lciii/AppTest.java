package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void contrato(){
        RegistroPrototipos registro = new RegistroPrototipos();
        Documento doc = registro.solicitar("Contrato A");
        assertEquals("Clonando Contrato", doc.clonar());
        assertEquals("Clonando Contrato y agregando: Hola", doc.anadir("Hola"));
    }
    @Test
    void reporte(){
        RegistroPrototipos registro = new RegistroPrototipos();
        Documento doc = registro.solicitar("Reporte A");
        assertEquals("Clonando Reporte", doc.clonar());
        assertEquals("Clonando Reporte y agregando: Hola", doc.anadir("Hola"));
    }
    @Test
    void formulario(){
        RegistroPrototipos registro = new RegistroPrototipos();
        Documento doc = registro.solicitar("Formulario A");
        assertEquals("Clonando Formulario", doc.clonar());
        assertEquals("Clonando Formulario y agregando: Hola", doc.anadir("Hola"));
    }
}