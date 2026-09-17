class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;

        

        
        int candidate1=0;
        int candidate2=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                count2++;
            }
            else if(count1==0){
                candidate1=nums[i];
                count1=1;
            }
             else if(count2==0){
                candidate2=nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }

int c1=0;
int c2=0;

        for(int num:nums){
            if(num==candidate1)c1++;
            if(num==candidate2)c2++;
        }
        List<Integer> res=new ArrayList<>();
        if(c1>n/3 && count1>0 ) res.add(candidate1);
        if(c2>n/3 && count2>0) res.add(candidate2);

        return res;
        
    }
}