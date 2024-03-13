class Solution {
    public int maxProfit(int[] prices) {
         int MinPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < MinPrice) {
                MinPrice = prices[i];
            } else if (prices[i] - MinPrice > MaxProfit) {
                MaxProfit = prices[i] - MinPrice;
            }
        }
        
        return MaxProfit;
    }
}