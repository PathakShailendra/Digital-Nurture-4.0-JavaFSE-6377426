package week1;

import java.util.*;

public class FinancialForecasting {

    // Step 1: Analyze past revenue
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
            if (revenue > max) max = revenue;
            if (revenue < min) min = revenue;
        }

        double average = total / revenues.size();

        System.out.printf("Average Monthly Revenue: %.2f\n", average);
        System.out.printf("Highest Monthly Revenue: %.2f\n", max);
        System.out.printf("Lowest Monthly Revenue: %.2f\n", min);
    }

    // Step 2 & 3: Recursive method to calculate future revenue
    public static double predictRevenue(int month, double currentRevenue, double growthRate) {
        if (month == 0) return currentRevenue;
        return predictRevenue(month - 1, currentRevenue, growthRate) * (1 + growthRate);
    }

    public static void main(String[] args) {
        List<Double> monthlyRevenues = Arrays.asList(
                10000.0, 12000.0, 11000.5, 9500.0,
                13000.0, 12500.0, 14000.0, 13500.0,
                15000.0, 14500.0, 15500.0, 16000.0
        );

        analyzeRevenue(monthlyRevenues);

        // Step 3: Estimate average monthly growth rate
        double firstMonth = monthlyRevenues.get(0);
        double lastMonth = monthlyRevenues.get(monthlyRevenues.size() - 1);
        double growthRate = Math.pow((lastMonth / firstMonth), (1.0 / (monthlyRevenues.size() - 1))) - 1;

        System.out.printf("\nEstimated Average Monthly Growth Rate: %.4f%%\n", growthRate * 100);

        int futureMonths = 6;
        double predicted = predictRevenue(futureMonths, lastMonth, growthRate);

        System.out.printf("📈 Predicted Revenue after %d months: %.2f\n", futureMonths, predicted);
    }
}
