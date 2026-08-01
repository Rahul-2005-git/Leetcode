class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
       Arrays.sort(nums);

       int len=1;
       int lLen=1;

       for(int i=1;i<nums.length;i++){
        if(nums[i]-nums[i-1]==1){
            len++;
        }
        else if(nums[i]-nums[i-1]!=0){
            len=1;
        }
        

        lLen=Math.max(lLen,len);
       }
        return lLen;
    }
}