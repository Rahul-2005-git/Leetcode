class Solution {
    public int[] twoSum(int[] nums, int target) {

        
        // int i=0,j=nums.length-1;
        int []res ={0,0};
        // while(i<j){
        //     if(nums[i]+nums[j]<target){
        //         i++;
        //     }
        //     else if(nums[i]+nums[j]>target){
        //         j--;
        //     }
        //     else{
        //         res[0]=i;
        //         res[1]=j;
        //         return res;
        //     }
        // }

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             res[0]=i;
        //             res[1]=j;
        //             return res;
        //         }
        //     }
        // }


        //by hashmap

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement =target -nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);

        }


        return res;
    }
}