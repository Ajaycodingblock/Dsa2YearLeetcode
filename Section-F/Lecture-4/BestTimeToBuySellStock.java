public class BestTimeToBuySellStock {

    // 🔴 Brute Force Approach (Two Loops)
    // Time: O(n²), Space: O(1)
    public static int maxProfitBrute(int[] prices) {

        int maxProfit = 0;

        // Try every buy day
        for (int i = 0; i < prices.length; i++) {

            // Try every sell day after buy
            for (int j = i + 1; j < prices.length; j++) {

                int profit = prices[j] - prices[i];

                // Update maximum profit
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    // 🟢 Optimized Approach (Single Loop)
    // Time: O(n), Space: O(1)
    public static int maxProfitOptimized(int[] prices) {

        int maxProfit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {

            // Keep track of minimum buying price
            buy = Math.min(buy, prices[i]);

            // Calculate profit if sold today
            int currProfit = prices[i] - buy;

            // Update maximum profit
            maxProfit = Math.max(maxProfit, currProfit);
        }
        return maxProfit;
    }

    // 🔹 Main Function
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Brute Force Profit: " + maxProfitBrute(prices));
        System.out.println("Optimized Profit: " + maxProfitOptimized(prices));
    }
}
