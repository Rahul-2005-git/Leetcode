class Solution {
    public int missingInteger(int[] nums) {
        int i;
        int sum=nums[0];
        HashSet<Integer> set =new HashSet<>();

        for( i=1;i<nums.length;i++){

            if(nums[i]!=nums[i-1]+1){
                break;
            }
            sum+=nums[i];
        }
        for(int j=i-1;j<nums.length;j++){
            set.add(nums[j]);
        }
        while(set.contains(sum)){
            sum++;
        }


        return sum;
    }

}