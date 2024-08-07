package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

public class Selector {
    private Scanner scan;

    public Selector(Scanner scan) {
        this.scan = scan;
    }
    public String selectorDocumento(int opcion){
        switch (opcion){
            case 1:
                DocumentoTexto doc = new DocumentoTexto();
                int optionDoc = opciones();
                return casoDoc(optionDoc, doc);
            case 2:
                HojaCalculo hoja = new HojaCalculo();
                int optionHoja = opciones();
                return casoHoja(optionHoja, hoja);
            case 3:
                Presentacion presentacion = new Presentacion();
                int optionPre = opciones();
                return casoPresentacion(optionPre, presentacion);
            default:
                return "Opcion invalida";
        }
    }

    public int opciones() {
        System.out.println("ELIJA UN TIPO DE ANALISIS:");
        System.out.println("1- Analisis Estadistico");
        System.out.println("2- Analisis Complejidad");
        System.out.println("3- Analisis Palabras Clave");
        return scan.nextInt();

    }

    public String casoPresentacion(int optionPre, Presentacion presentacion) {
        switch (optionPre) {
            case 1:
                AnalisisEstadistico analisisEstadisticoPresentacion = new AnalisisEstadistico();
                return analisisEstadisticoPresentacion.visitarPresentacion(presentacion);
            case 2:
                AnalisisComplejidad analisisComplejidadPresentacion = new AnalisisComplejidad();
                return analisisComplejidadPresentacion.visitarPresentacion(presentacion);
            case 3:
                AnalisisPalabrasClaves analisisClavesPresentacion = new AnalisisPalabrasClaves();
                return analisisClavesPresentacion.visitarPresentacion(presentacion);
            default:
                return "Opcion invalida";
        }
    }

    public String casoHoja(int optionHoja, HojaCalculo hoja) {
        switch (optionHoja) {
            case 1:
                AnalisisEstadistico analisisEstadisticoHoja = new AnalisisEstadistico();
                return analisisEstadisticoHoja.visitarHojaCalculo(hoja);
            case 2:
                AnalisisComplejidad analisisComplejidadHoja = new AnalisisComplejidad();
                return analisisComplejidadHoja.visitarHojaCalculo(hoja);
            case 3:
                AnalisisPalabrasClaves analisisClavesHoja = new AnalisisPalabrasClaves();
                return analisisClavesHoja.visitarHojaCalculo(hoja);
            default:
                return "Opcion invalida";
        }
    }
    public String casoDoc(int optionDoc, DocumentoTexto doc) {
        switch (optionDoc){
            case 1:
                AnalisisEstadistico analisisEstadisticoDoc = new AnalisisEstadistico();
                return analisisEstadisticoDoc.visitarDocumentoTexto(doc);
            case 2:
                AnalisisComplejidad analisisComplejidadDoc = new AnalisisComplejidad();
                return analisisComplejidadDoc.visitarDocumentoTexto(doc);
            case 3:
                AnalisisPalabrasClaves analisisClavesDoc = new AnalisisPalabrasClaves();
                return analisisClavesDoc.visitarDocumentoTexto(doc);
            default:
                return "Opcion invalida";
        }
    }
}
