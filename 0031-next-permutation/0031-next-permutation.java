class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length<2) return;
        int n=nums.length;
        
        int i;
        int j=n-1;
        
        for( i=n-1;i>0;i--){
        if(nums[i]>nums[i-1])
         
            break;
        }
        i-=1;
        j=i+1;
        int max=j;;
        while(j<n && i>=0){
            
            if(nums[j]>nums[i] && nums[j]<=nums[max]){
               max=j;
            }
            j++;
        }
      
        if(i<0){
            Arrays.sort(nums);
        }else{
            int temp=nums[i];
            nums[i]=nums[max];
            nums[max]=temp;

            Arrays.sort(nums,i+1,n);
        }

    }
}