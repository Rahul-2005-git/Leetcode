class Solution {
    public int[] findErrorNums(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        int[] res=new int[2];
        int n=nums.length;
        for(int i=1;i<n+1;i++){
            set.add(i);

        }

        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else{
                res[0]=nums[i];
            }
        }
        int i=1;
        for(int num:set){
            res[i]=num;
            i++;
        }
        return res;
    }
}