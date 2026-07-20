class Solution {
    public int search(int[] nums, int target) {
         int i=0,j=nums.length-1;



        while(i<=j){
            int mid=(j-i)/2+i;
            if(nums[mid]==target) return mid;

        //    else if(nums[mid]>nums[i] && nums[mid]>target)j=mid;
        //      else if(nums[mid]<nums[j] && nums[mid]<target) i=mid+1;
        //      else if(nums[mid]<nums[i] && target<nums[mid] || target>nums[i])
        //      j=mid-1;
        //     else if(nums[mid]<nums[i] && target>nums[mid] || target<nums[i])
        //      i=mid+1;
        //       else if(nums[mid]>nums[j] && target>nums[mid] || target<nums[j])
        //      i=mid+1;
        //     else if(nums[mid]>nums[i] && target<nums[mid] && target<nums[i])
        //      j=mid-1;

        else if(nums[i]<=nums[mid]){
            if(nums[i] <= target && target < nums[mid]){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
         else if(nums[j]>=nums[mid]){
            if(nums[j] >= target && target > nums[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
    
        }
        return -1;
        

        
    }
}