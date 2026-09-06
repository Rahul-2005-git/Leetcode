class Solution {
    public int countDigits(int num) {



        int n=num;
        int res=0;

        while(n>0){
            int temp=n%10;
            n=n/10;
            if(num%temp==0){
                res++;
            }
        }
        return res;
    }
}