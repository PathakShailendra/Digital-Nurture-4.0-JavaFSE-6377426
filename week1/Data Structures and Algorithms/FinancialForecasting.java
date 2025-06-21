package week1;

import java.util.Arrays;
import java.util.List;

public class FinancialForecasting {

        public static void analyzeRevenue(List<Double> revenues) {
            if (revenues == null || revenues.isEmpty()) {
                System.out.println("No revenue data available.");
                return;
            }

            double total = 0.0;
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;

            for (double revenue : revenues) {
                total += revenue;
                if (revenue > max) {
                    max = revenue;
                }
                if (revenue < min) {
                    min = revenue;
                }
            }

            double average = total / revenues.size();

            System.out.printf("Average Monthly Revenue: %.2f\n", average);
            System.out.printf("Highest Monthly Revenue: %.2f\n", max);
            System.out.printf("Lowest Monthly Revenue: %.2f\n", min);
        }

        public static void main(String[] args) {
            List<Double> monthlyRevenues = Arrays.asList(
                    10000.0, 12000.0, 11000.5, 9500.0,
                    13000.0, 12500.0, 14000.0, 13500.0,
                    15000.0, 14500.0, 15500.0, 16000.0
            );

            analyzeRevenue(monthlyRevenues);
        }

}
