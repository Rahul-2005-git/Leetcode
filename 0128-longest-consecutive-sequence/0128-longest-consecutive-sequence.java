class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set=new HashSet<>();
        int lLen=0;

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int num:set){

            
            if(!set.contains(num-1)){
                int length=1;
                int n=num;
                while(set.contains(n+1)){
                    length++;
                    n++;

                }
                    lLen=Math.max(lLen,length);
            }

        }
        return lLen;
    }
}