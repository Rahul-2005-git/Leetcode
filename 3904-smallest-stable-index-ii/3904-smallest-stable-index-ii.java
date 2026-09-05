class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int n=nums.length;
        int [] small=new int[n];
        int []large= new int[n];

        small[n-1]=nums[n-1];
        large[0]=nums[0];

        for(int i=1;i<n;i++){

            if(nums[n-1-i]>small[n-i]){
                small[n-1-i]=small[n-i];
            }
            else{
                small[n-1-i]=nums[n-1-i];
            }

            if(nums[i]<large[i-1]){
                large[i]=large[i-1];

            }
            else{
                large[i]=nums[i];
            }
        }


        for(int i=0;i<n;i++){
                if(large[i]-small[i]<=k){
                    return i;
                }
        }
        return -1;
    }
}