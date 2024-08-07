package ar.edu.utn.frc.tup.lciii;

public class SistemaPago {
    private PasarelaPago pasarela;

    public SistemaPago(PasarelaPago pasarela){
        this.pasarela = pasarela;
    }

    public String pagar(){
        return pasarela.iniciarPago() + System.lineSeparator() + pasarela.procesarPago() + System.lineSeparator() + pasarela.confirmarPago();
    }
    public void cambiarMedio(PasarelaPago pasarela){
        this.pasarela = pasarela;
    }
}
