public class MyPdfDocument extends PdfDocument {
    @Override
    public void open() {
        System.out.println("open() method called for Pdf Document");
        System.out.println("Opening PDF Document...");
    }
}
