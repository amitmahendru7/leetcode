class Solution {
    public int maxProfit(int[] prices) {
        int t1Cost = Integer.MAX_VALUE;
        int t2Cost = Integer.MAX_VALUE;
        int t1Profit =0;
        int maxProfit=0;
        
        for(int i:prices){
            t1Cost = Math.min(i,t1Cost);
            t1Profit = Math.max(t1Profit, i-t1Cost);
            t2Cost = Math.min(t2Cost, i - t1Profit);
            maxProfit = Math.max(maxProfit, i- t2Cost);
        }
        return maxProfit;
    }
}