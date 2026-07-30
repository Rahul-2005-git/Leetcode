class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int j=0;

        for(int i=0;i<nums.length;i++){
            if(i-j>k){
                set.remove(nums[j]);
                j++;
            }
        
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }

        return false;
    }
}