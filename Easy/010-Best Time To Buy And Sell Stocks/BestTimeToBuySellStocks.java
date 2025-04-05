package org.example.arrays.easy;

public class BestTimeToBuySellStocks {

    public int maxProfit(int[] prices) {
        // Initialize minPrice to a large number and maxProfit to 0
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Loop through each price in the array
            for (int price : prices) {
            // Update the minimum price encountered so far
            if (price < minPrice) {
                minPrice = price;
            }

            // Calculate the potential profit if sold at the current price
            int profit = price - minPrice;

            // Update the maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

            return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuySellStocks solution = new BestTimeToBuySellStocks();

        // Example 1:
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit for prices1: " + solution.maxProfit(prices1)); // Output: 5

        // Example 2:
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit for prices2: " + solution.maxProfit(prices2)); // Output: 0
    }
}
