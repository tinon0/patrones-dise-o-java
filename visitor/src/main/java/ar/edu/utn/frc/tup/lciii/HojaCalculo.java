package ar.edu.utn.frc.tup.lciii;

public class HojaCalculo {
    public void aceptar(DocumentoVisitor docVisitor){
        docVisitor.visitarHojaCalculo(this);
    }
}
