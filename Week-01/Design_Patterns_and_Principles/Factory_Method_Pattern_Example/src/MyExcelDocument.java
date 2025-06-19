public class MyExcelDocument extends ExcelDocument {
    @Override
    public void open() {
        System.out.println("open() method called for Excel Document");
        System.out.println("Opening Excel Document...");
    }
}
