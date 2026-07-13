class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // for(int i=0;i<nums.length;i++){
        //      int j=i+1;
        //      while(j<nums.length){
        //         if(nums[i]==nums[j])return true;
        //         j++;
        //      } 
        // }

        HashSet<Integer> set =new HashSet<>();

        for(int i:nums){
            if(set.contains(i))return true;
            set.add(i);
        }


        return false;
    }
}