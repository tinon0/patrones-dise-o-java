package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void paypal(){
        PasarelaPago paypal = new AdaptadorPayPal();
        SistemaPago sistema = new SistemaPago(paypal);

        assertEquals("Pago por PayPal iniciado"
                                + System.lineSeparator()+
                                "Pago por PayPal procesandose"
                                + System.lineSeparator()+
                                "Pago por PayPal confirmado!",sistema.pagar());
    }
    @Test
    void stripe(){
        PasarelaPago stripe = new AdaptadorStripe();
        SistemaPago sistema = new SistemaPago(stripe);

        assertEquals("Pago por Stripe iniciado"
                + System.lineSeparator()+
                "Pago por Stripe procesandose"
                + System.lineSeparator()+
                "Pago por Stripe confirmado!",sistema.pagar());
    }
    @Test
    void authorizeNet(){
        PasarelaPago authorizeNet = new AdaptadorAuthorizeNet();
        SistemaPago sistema = new SistemaPago(authorizeNet);

        assertEquals("Pago por AuthorizeNet iniciado"
                + System.lineSeparator()+
                "Pago por AuthorizeNet procesandose"
                + System.lineSeparator()+
                "Pago por AuthorizeNet confirmado!",sistema.pagar());
    }
}