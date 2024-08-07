package ar.edu.utn.frc.tup.lciii;

public class AnalisisPalabrasClaves implements DocumentoVisitor{
    @Override
    public String visitarDocumentoTexto(DocumentoTexto documentotxt) {
        return "Palabras claves de un Documento de Texto";
    }

    @Override
    public String visitarHojaCalculo(HojaCalculo hojaCalculo) {
        return "Palabras claves de una Hoja de Calculo";
    }

    @Override
    public String visitarPresentacion(Presentacion presentacion) {
        return "Palabras claves de una Presentacion";
    }
}
