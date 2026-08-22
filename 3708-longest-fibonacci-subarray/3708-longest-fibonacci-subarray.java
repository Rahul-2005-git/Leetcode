class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length==1)return 1;
        int maxLen=2;
        int len=2;
       for(int i=2;i<nums.length;i++){
                if(nums[i]==nums[i-1]+nums[i-2]){
                    len++;
                }
                else{
                    len=2;
                }
                maxLen=Math.max(maxLen,len);
       }
       return maxLen;
    }
}