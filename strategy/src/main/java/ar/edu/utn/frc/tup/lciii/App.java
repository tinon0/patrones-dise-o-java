package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Strategy Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        EstrategiaPago tarjeta = new PagoTarjetaCredito();
        EstrategiaPago paypal = new PagoPayPal();
        EstrategiaPago tranferencia = new PagoTransferenciaBancaria();

        ProcesoPago pago = new ProcesoPago(tarjeta);

        System.out.println(pago.procesarPago());
        pago.cambiarEstrategia(paypal);
        System.out.println(pago.procesarPago());
        pago.cambiarEstrategia(tranferencia);
        System.out.println(pago.procesarPago());
    }
}
