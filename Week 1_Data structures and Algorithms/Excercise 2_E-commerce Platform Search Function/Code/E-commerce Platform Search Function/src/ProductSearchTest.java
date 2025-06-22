public class ProductSearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Footwear"),
                new Product(103, "T-Shirt", "Clothing"),
                new Product(104, "Camera", "Electronics"),
                new Product(105, "Watch", "Accessories")
        };

        Product found1 = ProductSearch.linearSearch(products, "Camera");
        System.out.println("Linear Search Result: " + (found1 != null ? found1 : "Not Found"));

        ProductSearch.sortProductsByName(products);

        Product found2 = ProductSearch.binarySearch(products, "Camera");
        System.out.println("Binary Search Result: " + (found2 != null ? found2 : "Not Found"));
    }
}
