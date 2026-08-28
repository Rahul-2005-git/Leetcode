class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int num:nums){
            if(num>max){
                max=num;
            }
            else if(num<min){
                min=num;
            }
        }
        int gcd=min;
        int i=1;
        while(max%gcd!=0 || min%gcd!=0){
            gcd--;
        }
        return gcd;
    }
}