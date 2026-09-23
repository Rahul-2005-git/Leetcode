class Solution {
    public int minOperations(int[] nums, int x) {
        
        int l=0;
        int n=nums.length;

        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        int target=totalSum-x;
        int res=-1;
        int sum=0;
        int maxL=-1;
        if(target==0){
            return n;
        }
        if(target<0)return -1;

        for(int i=0;i<n;i++){
          

            sum+=nums[i];
            while(sum>target){
                sum-=nums[l];
                l++;
            }
        
            
            if(sum==target){
                
               maxL=Math.max(maxL,i-l+1);
               res=n-maxL;
                // System.out.println(i-l+1);
                
                }
        }
           
        return res;
   
    }
}