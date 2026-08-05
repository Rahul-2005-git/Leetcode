class Solution {
    public int[] plusOne(int[] digits) {
       int carry=1;
       int n=digits.length-1;
       while(carry>0 && n>=0){
            digits[n]+=1;
            if(digits[n]==10){
                digits[n]=0;
                n--;
            }
            else{
                carry=0;
            }
       }
       if(carry==1){
        int [] res=new int[digits.length+1];
        res[0]=1;
        for(int i=1;i<digits.length+1;i++){
            res[i]=digits[i-1];
        }
        return res;
       }

       return digits;
    }
}