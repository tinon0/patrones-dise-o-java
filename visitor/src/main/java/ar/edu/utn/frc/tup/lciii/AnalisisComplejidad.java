package ar.edu.utn.frc.tup.lciii;

public class AnalisisComplejidad implements DocumentoVisitor{
    @Override
    public String visitarDocumentoTexto(DocumentoTexto documentotxt) {
        return "Complejidad de un Documento de Texto";
    }

    @Override
    public String visitarHojaCalculo(HojaCalculo hojaCalculo) {
        return "Complejidad de una Hoja de Calculo";
    }

    @Override
    public String visitarPresentacion(Presentacion presentacion) {
        return "Complejidad de una Presentacion";
    }
}
