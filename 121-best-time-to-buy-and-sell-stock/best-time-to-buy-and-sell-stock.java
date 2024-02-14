class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int curr = Integer.MAX_VALUE;
        for(int price : prices){
            curr = Math.min(curr, price);
            maxProfit = Math.max(maxProfit, price - curr);
        }
        return maxProfit;
    }
}