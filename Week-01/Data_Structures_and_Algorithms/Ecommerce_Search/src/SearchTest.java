public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Book", "Stationery"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Shoes", "Footwear"),
                new Product(105, "Phone", "Electronics")
        };

        int idToBeSearched = 102;

        System.out.println("Linear Search:");
        Product found1 = ProductSearch.linearSearch(products, idToBeSearched);
        if(found1!=null){
            System.out.println("Product with id " + idToBeSearched + " found.");
            System.out.println("Product id : " + found1.getProductId());
            System.out.println("Product Name : " + found1.getProductName());
            System.out.println("Product Category : " + found1.getCategory());
        }else{
            System.out.println("Product with id " + idToBeSearched + " not found!");
        }

        System.out.println("\nBinary Search:");
        ProductSearch.sortById(products);
        Product found2 = ProductSearch.binarySearch(products, idToBeSearched);
        if(found2!=null){
            System.out.println("Product with id " + idToBeSearched + "found.");
            System.out.println("Product id : " + found2.getProductId());
            System.out.println("Product Name : " + found2.getProductName());
            System.out.println("Product Category : " + found2.getCategory());
        }else{
            System.out.println("Product with id " + idToBeSearched + "not found!");
        }
    }
}
