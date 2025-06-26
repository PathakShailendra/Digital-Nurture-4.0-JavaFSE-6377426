package week1;

public class ImplementingFactoryMethodPattern {

    // Step 1: Product Interface
    interface Document {
        void open();
    }

    // Step 2: Concrete Product - WordDocument
    static class WordDocument implements Document {
        @Override
        public void open() {
            System.out.println("Opening Word Document...");
        }
    }

    // Step 2: Concrete Product - PdfDocument
    static class PdfDocument implements Document {
        @Override
        public void open() {
            System.out.println("Opening PDF Document...");
        }
    }

    // Step 2: Concrete Product - ExcelDocument
    static class ExcelDocument implements Document {
        @Override
        public void open() {
            System.out.println("Opening Excel Document...");
        }
    }

    // Step 3: Abstract Factory
    static abstract class DocumentFactory {
        public abstract Document createDocument();
    }

    // Step 4: Concrete Factory - Word
    static class WordDocumentFactory extends DocumentFactory {
        @Override
        public Document createDocument() {
            return new WordDocument();
        }
    }

    // Step 4: Concrete Factory - PDF
    static class PdfDocumentFactory extends DocumentFactory {
        @Override
        public Document createDocument() {
            return new PdfDocument();
        }
    }

    // Step 4: Concrete Factory - Excel
    static class ExcelDocumentFactory extends DocumentFactory {
        @Override
        public Document createDocument() {
            return new ExcelDocument();
        }
    }

    // Step 5: Main method (test class)
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
