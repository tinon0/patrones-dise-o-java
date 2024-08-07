package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }
    @Test
    void mainCafe() {
        final String input = "1";
        String menu = "ELIJA SU BEBIDA" + System.lineSeparator() + "1- CAFE" + System.lineSeparator() + "2- TE" + System.lineSeparator() + "3- CHOCOLATE CALIENTE";
        provideInput(input);
        App.main(new String[0]);
        assertEquals(menu + System.lineSeparator() + "Caliento agua a 90°" + System.lineSeparator() +
                    "Agregar cafe" + System.lineSeparator() +
                    "Agregar azucar" + System.lineSeparator(), getOutput());
    }
    @Test
    void menuTe(){
        final String input = "2";
        String menu = "ELIJA SU BEBIDA" + System.lineSeparator() + "1- CAFE" + System.lineSeparator() + "2- TE" + System.lineSeparator() + "3- CHOCOLATE CALIENTE";
        provideInput(input);
        App.main(new String[0]);
        assertEquals(menu + System.lineSeparator() + "Calentar agua a 100°" + System.lineSeparator() +
                "Agregar saquito de te" + System.lineSeparator() +
                "Agregar edulcorante" + System.lineSeparator(), getOutput());
    }
    @Test
    void menuChocolateCaliente(){
        final String input = "3";
        String menu = "ELIJA SU BEBIDA" + System.lineSeparator() + "1- CAFE" + System.lineSeparator() + "2- TE" + System.lineSeparator() + "3- CHOCOLATE CALIENTE";
        provideInput(input);
        App.main(new String[0]);
        assertEquals(menu + System.lineSeparator() + "Calentar a 65°" + System.lineSeparator() +
                "Agregar chocolatada" + System.lineSeparator() +
                "Agregar canela" + System.lineSeparator(), getOutput());
    }
//    @Test
//    void mainError(){
//        final String input = "4";
//        //String menu = "ELIJA SU BEBIDA" + System.lineSeparator() + "1- CAFE" + System.lineSeparator() + "2- TE" + System.lineSeparator() + "3- CHOCOLATE CALIENTE";
//        provideInput(input);
//        App.main(new String[0]);
//        assertThrows(IllegalArgumentException.class, () -> getOutput());
//    }

    /* Here you will write your test */
}