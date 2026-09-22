class Solution {
    public int maxWidthRamp(int[] nums) {
        
        int res=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            if(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                stack.push(i);
            }else if(stack.isEmpty()){
                stack.push(i);
            }
        }

        for(int i=0;i<nums.length;i++){
            
            while(!stack.isEmpty() && nums[i]<=nums[stack.peek()]){
                
                res=Math.max(res,stack.pop()-i);
                
            }
                
            
           
        }
        return res;
    }
}