class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minValue = prices[0];
        int maxProfit = 0;
       
       for(int i = 0; i < n; i++){
       if(prices[i] < minValue){
        minValue = prices[i];
       }
    int profit = prices[i] - minValue;
if(profit > maxProfit){
    maxProfit = profit;
}
       }
 return maxProfit;
    }
}