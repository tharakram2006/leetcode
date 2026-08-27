import java.util.Arrays;

class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        
        int n = prices.length;
        int m = discounts.length;
        int k = Math.min(n, m);
        
        double total = 0.0;
        for (int i = 0; i < k; i++) {
            total += prices[n - 1 - i] * (100.0 - discounts[m - 1 - i]) / 100.0;
        }
        for (int i = 0; i < n - k; i++) {
            total += prices[i];
        }
        
        return total;
    }
}