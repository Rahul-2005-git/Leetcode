class Solution {
    public int minimumDeletions(int[] nums) {
        

        int min=nums[0],mini=0;
        int max=nums[0],maxi=0;

        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
                mini=i;
            }
            if(max<nums[i]){
                max=nums[i];
                maxi=i;
            }
        }
      
        int res=nums.length;
        

        res=Math.min(mini+1+nums.length-maxi, res);
        res=Math.min(maxi+1+nums.length-mini,res);

        int temp=Math.max(mini+1,maxi+1);
        res=Math.min(res, temp);
        temp=Math.max(nums.length-mini,nums.length-maxi);
        res=Math.min(res,temp);
        return res;
    }
}