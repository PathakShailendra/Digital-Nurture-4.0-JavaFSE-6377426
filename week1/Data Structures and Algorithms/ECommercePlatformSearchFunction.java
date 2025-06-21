package week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ECommercePlatformSearchFunction {

        public static List<String> searchProducts(List<String> products, String keyword) {
            List<String> result = new ArrayList<>();
            String lowerKeyword = keyword.toLowerCase();

            for (String product : products) {
                if (product.toLowerCase().contains(lowerKeyword)) {
                    result.add(product);
                }
            }

            // Sort the matched products alphabetically
            Collections.sort(result);
            return result;
        }

        public static void main(String[] args) {
            List<String> products = Arrays.asList("Mobile", "Laptop", "Mouse", "Charger", "Headphones", "microphone");
            String keyword = "mo";

            List<String> matchedProducts = searchProducts(products, keyword);

            System.out.println("Matched Products:");
            for (String product : matchedProducts) {
                System.out.println(product);
            }
        }
}
