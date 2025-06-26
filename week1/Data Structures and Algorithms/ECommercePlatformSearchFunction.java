package week1;

import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return "ProductID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}

public class ECommercePlatformSearchFunction {

    // Linear Search (Case-insensitive)
    public static List<Product> linearSearch(List<Product> products, String keyword) {
        List<Product> result = new ArrayList<>();
        String lowerKeyword = keyword.toLowerCase();

        for (Product product : products) {
            if (product.productName.toLowerCase().contains(lowerKeyword)) {
                result.add(product);
            }
        }

        // Sort result by product name
        result.sort(Comparator.comparing(p -> p.productName.toLowerCase()));
        return result;
    }

    // Binary Search (Exact match required)
    public static Product binarySearch(List<Product> sortedProducts, String targetName) {
        int left = 0, right = sortedProducts.size() - 1;
        targetName = targetName.toLowerCase();

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midName = sortedProducts.get(mid).productName.toLowerCase();

            int cmp = midName.compareTo(targetName);
            if (cmp == 0) {
                return sortedProducts.get(mid);
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // not found
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(101, "Mobile", "Electronics"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Mouse", "Accessories"),
                new Product(104, "Charger", "Accessories"),
                new Product(105, "Headphones", "Electronics"),
                new Product(106, "Microphone", "Accessories")
        );

        String keyword = "mo";
        System.out.println("🔎 Linear Search Results for keyword '" + keyword + "':");
        List<Product> linearResults = linearSearch(products, keyword);
        for (Product p : linearResults) {
            System.out.println(p);
        }

        // For Binary Search - sort by productName
        List<Product> sortedProducts = new ArrayList<>(products);
        sortedProducts.sort(Comparator.comparing(p -> p.productName.toLowerCase()));

        String exactSearch = "Mouse";
        Product foundProduct = binarySearch(sortedProducts, exactSearch);

        System.out.println("\n🔍 Binary Search Result for exact name '" + exactSearch + "':");
        if (foundProduct != null) {
            System.out.println(foundProduct);
        } else {
            System.out.println("Product not found!");
        }
    }
}
