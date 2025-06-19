public class MyWordDocument extends WordDocument {
    @Override
    public void open() {
        System.out.println("open() method called for Word Document");
        System.out.println("Opening Word Document...");
    }
}
