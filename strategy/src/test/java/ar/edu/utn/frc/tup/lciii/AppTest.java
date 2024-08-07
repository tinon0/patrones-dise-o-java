package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /* Here you will write your test */
    @Test
    void tarjeta(){
        EstrategiaPago tarjeta = new PagoTarjetaCredito();
        ProcesoPago pago = new ProcesoPago(tarjeta);
        String respuesta = pago.procesarPago();
        assertEquals("Credito realizado con exito", respuesta);
    }
    @Test
    void paypal(){
        EstrategiaPago paypal = new PagoPayPal();
        ProcesoPago pago = new ProcesoPago(paypal);
        String respuesta = pago.procesarPago();
        assertEquals("Pago de PayPal exitosamente realizado", respuesta);
    }
    @Test
    void tranferencia(){
        EstrategiaPago transferencia = new PagoTransferenciaBancaria();
        ProcesoPago pago = new ProcesoPago(transferencia);
        String respuesta = pago.procesarPago();
        assertEquals("Transferencia bancaria realizada con exito", respuesta);
    }
    @Test
    void cambiarEstrategia(){
        EstrategiaPago transferencia = new PagoTransferenciaBancaria();
        EstrategiaPago paypal = new PagoPayPal();
        ProcesoPago pago = new ProcesoPago(transferencia);
        pago.cambiarEstrategia(paypal);
        String respuesta = paypal.realizarPago();
        assertEquals("Pago de PayPal exitosamente realizado", respuesta);
    }
    @Test
    void metodosConcretos(){
        PagoPayPal pagoPayPal = new PagoPayPal();
        String respuesta = pagoPayPal.autentificacionCuenta();
        assertEquals("Cuenta de PayPal verificada", respuesta);
    }
    @Test
    void metodosConcretos2(){
        PagoTarjetaCredito pagoTarjetaCredito = new PagoTarjetaCredito();
        String respuesta = pagoTarjetaCredito.verificacionTarjeta();
        assertEquals("Tarjeta de Credito verificada", respuesta);
    }
    @Test
    void metodosConcretos3(){
        PagoTransferenciaBancaria pagoTransferenciaBancaria = new PagoTransferenciaBancaria();
        String respuesta = pagoTransferenciaBancaria.tranferencia();
        assertEquals("Transferencia aprobada", respuesta);
    }
}