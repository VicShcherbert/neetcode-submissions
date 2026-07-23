class Solution {
    public int maxProfit(int[] prices) {
        // int left = 0, right = 1;
        // int max = 0;
        // while(right < prices.length){
        //     if(prices[left] < prices[right]){
        //         if(prices[right] - prices[left] > max) max = prices[right] - prices[left];
        //     } else {
        //         left = right;
        //     }
        //     right++;
        // }
        // return max;

        int left = 0; 
        int right = 1;
        int maxProfit = 0;
        while(right < prices.length){
            if(prices[left] > prices[right]) left = right;
            else {
                int currentMax = prices[right] - prices[left];
                if(currentMax > maxProfit) maxProfit=currentMax;
            }
            right++;
        }
        return maxProfit;
    }
}
