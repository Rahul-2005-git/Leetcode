class Solution {
    public int maxProfit(int[] prices) {

        int buy=0;
        int sell=prices.length-1;
        int maxP=0;
        int min=prices[0];
        
        for(int i=0;i<prices.length;i++){
            
            if(prices[i]<min)min=prices[i];

            if(prices[i]-min> maxP)maxP=prices[i]-min;

        }
        return maxP;


    }
}