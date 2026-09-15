class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=1;
        int limit=0;
        for(int j=1;j<nums.length;j++){

        if(nums[i-1]!=nums[j]){
            limit=0;
        }
        else{
            limit++;
        }

            if(limit<2 )
         {

               nums[i]=nums[j];
               i++;
           
        }

        }
        return i;
    }
}