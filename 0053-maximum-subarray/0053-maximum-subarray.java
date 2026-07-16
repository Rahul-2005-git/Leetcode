class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currentSum=0;

        
            for (int j = 0; j < nums.length; j++) {

                    currentSum +=nums[j];
                maxSum = Math.max(maxSum, currentSum);
                if(currentSum<0)currentSum=0;

            }
        

        return maxSum;
    }
}