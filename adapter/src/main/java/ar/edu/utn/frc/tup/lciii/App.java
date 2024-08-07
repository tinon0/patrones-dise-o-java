package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        PasarelaPago paypal = new AdaptadorPayPal();
        PasarelaPago stripe = new AdaptadorStripe();
        PasarelaPago authorizeNet = new AdaptadorAuthorizeNet();

        SistemaPago sistema = new SistemaPago(paypal);
        System.out.println(sistema.pagar());

        sistema.cambiarMedio(stripe);
        System.out.println(sistema.pagar());

        sistema.cambiarMedio(authorizeNet);
        System.out.println(sistema.pagar());
    }
}
