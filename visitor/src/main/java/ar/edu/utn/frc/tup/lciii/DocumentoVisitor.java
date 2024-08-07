package ar.edu.utn.frc.tup.lciii;

public interface DocumentoVisitor {
    String visitarDocumentoTexto(DocumentoTexto documentotxt);
    String visitarHojaCalculo(HojaCalculo hojaCalculo);
    String visitarPresentacion(Presentacion presentacion);
}
