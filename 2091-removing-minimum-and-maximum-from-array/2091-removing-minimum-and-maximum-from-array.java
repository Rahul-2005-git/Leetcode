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
        System.out.println(min+" "+mini);
        System.out.println(max+" "+maxi);
        System.out.println(nums.length);
        int res=nums.length;
        // if(mini+1<=nums.length/2){
        //     res=mini+1;
        //     if(maxi+1<=nums.length/2)return Math.max(maxi+1,res);
            
        //     return res+nums.length-maxi;
        // }
        //  if(mini+1>nums.length/2){
        //     res=nums.length-mini;
        //     if(maxi+1>res/2)return Math.max(nums.length-maxi,res);
            
        //     return res+maxi+1;
        // }

        res=Math.min(mini+1+nums.length-maxi, res);
        res=Math.min(maxi+1+nums.length-mini,res);

        int temp=Math.max(mini+1,maxi+1);
        res=Math.min(res, temp);
        temp=Math.max(nums.length-mini,nums.length-maxi);
        res=Math.min(res,temp);
        return res;
    }
}