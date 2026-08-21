class Solution {

    int []dp;
    public int rob(int[] nums) {

            dp=new int[nums.length];
            Arrays.fill(dp,-1);

           return  solve(nums,0);



        // int n=nums.length;
        // int prev1=0;
        // int prev2=0;
        // int rob=0;
        // for(int i=0;i<n;i++){
        //    int curr=Math.max(prev1,prev2+nums[i]);

        //    prev2=prev1;
        //    prev1=curr;
        //    rob+=curr;
        // }
        // return prev1;
    }

    int solve (int [] nums, int i){
            if(i<0 || i>=nums.length) return 0;

            if(dp[i]!=-1) return dp[i];
             int rob = nums[i] + solve(nums, i + 2);
        int skip = solve(nums, i + 1);
            return dp[i]=Math.max(rob,skip);
    }
}