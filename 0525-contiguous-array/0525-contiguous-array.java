class Solution {
    public int findMaxLength(int[] nums) {
        

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int res=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]==1)sum++;
            if(nums[i]==0)sum--;

            if(map.containsKey(sum)){
                int l=i-map.get(sum);
                res=Math.max(res,l);
            }
            else{
                map.put(sum,i);
            }


        }
        return res;
    }
}