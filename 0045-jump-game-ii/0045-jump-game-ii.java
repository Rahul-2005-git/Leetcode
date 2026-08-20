class Solution {
    public int jump(int[] nums) {
        
        int maxJump=0;
        int jump=0;
        int end=0;
       if(nums.length==1)return 0;
        for(int i=0;i<nums.length;i++){
           
            if(maxJump<(nums[i]+i)){
                maxJump=nums[i]+i;
            
            }
            if(maxJump>=nums.length-1)return ++jump;
            if(end==i){
                end=maxJump;
                jump++;
            }
            
        }
        return jump;
    }
}