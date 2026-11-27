
class Solution {
    public int maximumSaleItems(int[][] items, int budget) {

        int n = items.length;
        int minP = Integer.MAX_VALUE;

        for(int[] item : items) {
            minP = Math.min(minP, item[1]);
        }

        int[] dp = new int[budget + 1];
        Arrays.fill(dp, -1000000);

        dp[0] = 0;

        for(int i = 0; i < n; i++) {

            int free = 0;

            for(int j = 0; j < n; j++) {
                if(i != j && items[j][0] % items[i][0] == 0) {
                    free++;
                }
            }

            int price = items[i][1];
            int gain = 1 + free;

            // 0/1 Knapsack
            for(int b = budget; b >= price; b--) {
                if(dp[b-price] != -1000000) {
                    dp[b] = Math.max(dp[b],
                                     dp[b-price] + gain);
                }
            }
        }

        int ans = 0;

        // Spend remaining budget on cheapest item
        for(int b = 0; b <= budget; b++) {
            if(dp[b] != -1000000) {
                ans = Math.max(ans,
                    dp[b] + (budget-b)/minP);
            }
        }

        return ans;
    }
}
