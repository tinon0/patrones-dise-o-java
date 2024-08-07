package ar.edu.utn.frc.tup.lciii;

public class DocumentoTexto {
    public void aceptar(DocumentoVisitor docVisitor){
        docVisitor.visitarDocumentoTexto(this);
    }
}
