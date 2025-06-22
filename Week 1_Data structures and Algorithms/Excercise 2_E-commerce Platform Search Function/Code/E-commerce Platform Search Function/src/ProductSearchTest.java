public class ProductSearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Footwear"),
                new Product(103, "T-Shirt", "Clothing"),
                new Product(104, "Camera", "Electronics"),
                new Product(105, "Watch", "Accessories")
        };

        // Linear search test
        Product found1 = ProductSearch.linearSearch(products, "Camera");
        System.out.println("Linear Search Result: " + (found1 != null ? found1 : "Not Found"));

        // Sort before binary search
        ProductSearch.sortProductsByName(products);

        // Binary search test
        Product found2 = ProductSearch.binarySearch(products, "Camera");
        System.out.println("Binary Search Result: " + (found2 != null ? found2 : "Not Found"));
    }
}

/*
 * ---------------------------------------------
 * Explanation: Big O Notation and Search Analysis
 * ---------------------------------------------
 * ➤ Big O notation describes the upper bound of an algorithm’s time or space complexity 
 *    in terms of input size (n). It allows us to evaluate the performance and scalability 
 *    of an algorithm independently of hardware or implementation details.
 *
 * ➤ It helps in choosing the most efficient algorithm by giving insight into:
 *    - Best Case: Optimal scenario performance
 *    - Average Case: Expected performance over various inputs
 *    - Worst Case: Maximum time taken in the most unfavorable input
 *
 * For search operations:
 * -----------------------
 * ▪ Linear Search:
 *    - Best Case: O(1) → Element is at the first position
 *    - Average Case: O(n/2) ≈ O(n) → Element is somewhere in the middle
 *    - Worst Case: O(n) → Element is at the last position or not present
 *
 * ▪ Binary Search:
 *    - Best Case: O(1) → Element is found at the midpoint initially
 *    - Average Case: O(log n) → Input size is halved each time
 *    - Worst Case: O(log n) → Element is in the last halved subrange or not found
 *
 * --------------------------------------------------
 * Comparison and Suitability: Linear vs Binary Search
 * --------------------------------------------------
 * ➤ Linear Search is simple and works on unsorted arrays, but becomes inefficient 
 *    for large datasets due to O(n) time complexity.
 *
 * ➤ Binary Search is highly efficient (O(log n)) but requires data to be sorted beforehand.
 *
 * ➤ In an e-commerce platform, product data is typically indexed and sorted, 
 *    making Binary Search the more suitable and scalable option for fast product lookups.
 */

