package ar.edu.utn.frc.tup.lciii;

public class AnalisisEstadistico implements DocumentoVisitor {
    @Override
    public String visitarDocumentoTexto(DocumentoTexto documentotxt) {
        return "Estadisticas de un Documento de Texto";
    }

    @Override
    public String visitarHojaCalculo(HojaCalculo hojaCalculo) {
        return "Estadisticas de una Hoja de Calculo";
    }

    @Override
    public String visitarPresentacion(Presentacion presentacion) {
        return "Estadisticas de una Presentacion";
    }
}
