package ar.edu.utn.frc.tup.lciii;

public class Presentacion{
    public void aceptar(DocumentoVisitor docVisitor){
        docVisitor.visitarPresentacion(this);
    }
}
