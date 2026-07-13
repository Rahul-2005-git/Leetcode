class Solution {
    public int[] productExceptSelf(int[] nums) {

        int tPro=1;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if( nums[i]!=0)
            tPro=tPro*nums[i];
            else {
                zero++;
            }
            
        }
        int [] answer = new int[nums.length];
        if(zero>1)return answer;

        if(zero==0){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 )
            answer[i]=tPro/nums[i];
        }
        }
        else{
            for(int i=0;i<nums.length;i++){
            if(nums[i]==0 )answer[i]=tPro;
        }
        }
        return answer;
    }
}